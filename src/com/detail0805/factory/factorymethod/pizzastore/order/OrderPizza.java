package com.detail0805.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;




public abstract class OrderPizza {

	//定義一個抽像方法，createPizza , 讓各個工廠子類自己實現
	abstract Pizza createPizza(String orderType);
	
	// 構造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType; // 訂購披薩的型別
		do {
			orderType = getType();
			pizza = createPizza(orderType); //抽像方法，由工廠子類完成
			//輸出pizza 製作過程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			
		} 
		while (true);
	}

	

	// 寫一個方法，可以獲取客戶希望訂購的披薩種類
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 種類:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
