package com.detail0805.proxy.cglib;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立目標對像
		TeacherDao target = new TeacherDao();
		//獲取到代理對象，並且將目標對像傳遞給代理對像
		TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();

		//執行代理對象的方法，觸發intecept 方法，從而實現 對目標對象的呼叫
		String res = proxyInstance.teach();
		System.out.println("res=" + res);
	}

}
