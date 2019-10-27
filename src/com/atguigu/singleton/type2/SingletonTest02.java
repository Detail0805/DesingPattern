package com.atguigu.singleton.type2;

public class SingletonTest02 {

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
	private  static Singleton instance;
	
	static { // 在靜態程式碼塊中，建立單例對像
		instance = new Singleton();
	}
	
	//3. 提供一個公有的靜態方法，返回實例對像
	public static Singleton getInstance() {
		return instance;
	}
	
}