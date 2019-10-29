package com.detail0805.singleton.type7;


public class SingletonTest07 {

	public static void main(String[] args) {
		System.out.println("使用靜態內部類完成單例模式");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
		
	}

}

// 靜態內部類完成， 推薦使用
class Singleton {
	private static volatile Singleton instance;
	
	//構造器私有化
	private Singleton() {}
	
	//寫一個靜態內部類,該類中有一個靜態屬性 Singleton
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton(); 
	}
	
	//提供一個靜態的公有方法，直接返回SingletonInstance.INSTANCE
	
	public static synchronized Singleton getInstance() {
		
		return SingletonInstance.INSTANCE;
	}
}