package com.atguigu.singleton.type3;


public class SingletonTest03 {

	public static void main(String[] args) {
		System.out.println("懶漢式1 ， 執行緒不安全~");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

class Singleton {
	private static Singleton instance;
	
	private Singleton() {}
	
	//提供一個靜態的公有方法，當使用到該方法時，才去建立 instance
	//即懶漢式
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}