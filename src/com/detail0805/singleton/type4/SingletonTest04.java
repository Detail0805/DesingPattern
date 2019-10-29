package com.detail0805.singleton.type4;


public class SingletonTest04 {

	public static void main(String[] args) {
		System.out.println("懶漢式2 ， 執行緒安全~");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

// 懶漢式(執行緒安全，同步方法)
class Singleton {
	private static Singleton instance;
	
	private Singleton() {}
	
	//提供一個靜態的公有方法，加入同步處理的程式碼，解決執行緒安全問題
	//即懶漢式
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}