package com.atguigu.proxy.staticproxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立目標對像(被代理對像)
		TeacherDao teacherDao = new TeacherDao();
		
		//建立代理對像, 同時將被代理對像傳遞給代理對像
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		
		//通過代理對象，呼叫到被代理對象的方法
		//即：執行的是代理對象的方法，代理對像再去呼叫目標對象的方法 
		teacherDaoProxy.teach();
	}

}
