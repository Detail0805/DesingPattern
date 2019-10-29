package com.detail0805.proxy.dynamic;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立目標對像
		ITeacherDao target = new TeacherDao();
		
		//給目標對象，建立代理對像, 可以轉成 ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
	
		// proxyInstance=class com.sun.proxy.$Proxy0 記憶體中動態產生了代理對像
		System.out.println("proxyInstance=" + proxyInstance.getClass());
		
		//通過代理對象，呼叫目標對象的方法
		//proxyInstance.teach();
		
		proxyInstance.sayHello(" tom ");
	}

}
