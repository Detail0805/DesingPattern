package com.atguigu.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	//維護一個目標對像 , Object
	private Object target;

	//構造器 ， 對target 進行初始化
	public ProxyFactory(Object target) {
		
		this.target = target;
	} 
	
	//給目標對像 產生一個代理對像
	public Object getProxyInstance() {
		
		//說明
		/*
		 *  public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
                                          
            //1. ClassLoader loader ： 指定當前目標對像使用的類載入器, 獲取載入器的方法固定
            //2. Class<?>[] interfaces: 目標對像實現的介面型別，使用泛型方法確認型別
            //3. InvocationHandler h : 事情處理，執行目標對象的方法時，會觸發事情處理器方法, 會把目前執行的目標對像方法作為參數傳入
		 */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("JDK代理開始~~");
						//反射機制呼叫目標對象的方法
						Object returnVal = method.invoke(target, args);
						System.out.println("JDK代理提交");
						return returnVal;
					}
				}); 
	}
	
	
}
