package com.detail0805.adapter.classadapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" === 類適配器模式 ====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}

}
