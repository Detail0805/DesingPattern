package com.detail0805.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {

	// 構造器
//	public OrderPizza() {
//		Pizza pizza = null;
//		String orderType; // 訂購披薩的型別
//		do {
//			orderType = getType();
//			if (orderType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName(" 希臘披薩 ");
//			} else if (orderType.equals("cheese")) {
//				pizza = new CheesePizza();
//				pizza.setName(" 奶酪披薩 ");
//			} else if (orderType.equals("pepper")) {
//				pizza = new PepperPizza();
//				pizza.setName("胡椒披薩");
//			} else {
//				break;
//			}
//			//輸出pizza 製作過程
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//			
//		} while (true);
//	}

	//定義一個簡單工廠對像
	SimpleFactory simpleFactory;
	Pizza pizza = null;
	
	//構造器
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = ""; //使用者輸入的
		
		this.simpleFactory = simpleFactory; //設定簡單工廠對像
		
		do {
			orderType = getType(); 
			pizza = this.simpleFactory.createPizza(orderType);
			
			//輸出pizza
			if(pizza != null) { //訂購成功
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println(" 訂購披薩失敗 ");
				break;
			}
		}while(true);
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
