package com.atguigu.visitor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();
		
		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
		
		
		//成功
		Success success = new Success();
		objectStructure.display(success);
		
		System.out.println("===============");
		Fail fail = new Fail();
		objectStructure.display(fail);
		
		System.out.println("=======給的是待定的測評========");
		
		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
