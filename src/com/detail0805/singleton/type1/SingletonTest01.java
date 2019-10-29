package com.detail0805.singleton.type1;

public class SingletonTest01 {

	public static void main(String[] args) {
		//測試
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

//餓漢式(靜態變數)

class Singleton {
	
	//1. 構造器私有化, 外部能new
	private Singleton() {
		
	}
	
	//2.本類內部建立對像實例
	private final static Singleton instance = new Singleton();
	
	//3. 提供一個公有的靜態方法，返回實例對像
	public static Singleton getInstance() {
		return instance;
	}
	
}