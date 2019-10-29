package com.detail0805.singleton.type8;

public class SingletonTest08 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		
		instance.sayOK();
	}
}

//使用列舉，可以實現單例, 推薦
enum Singleton {
	INSTANCE; //屬性
	public void sayOK() {
		System.out.println("ok~");
	}
}