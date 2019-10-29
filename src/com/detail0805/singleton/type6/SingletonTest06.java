package com.detail0805.singleton.type6;


public class SingletonTest06 {

	public static void main(String[] args) {
		System.out.println("雙重檢查");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
		
	}

}

// 懶漢式(執行緒安全，同步方法)
class Singleton {
	private static volatile Singleton instance;
	
	private Singleton() {}
	
	//提供一個靜態的公有方法，加入雙重檢查程式碼，解決執行緒安全問題, 同時解決懶載入問題
	//同時保證了效率, 推薦使用
	
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
			
		}
		return instance;
	}
}