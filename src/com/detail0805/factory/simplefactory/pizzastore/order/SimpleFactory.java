package com.detail0805.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

//簡單工廠類
public class SimpleFactory {

	//更加orderType 返回對應的Pizza 對像
	public Pizza createPizza(String orderType) {

		Pizza pizza = null;

		System.out.println("使用簡單工廠模式");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" 希臘披薩 ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" 奶酪披薩 ");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("胡椒披薩");
		}
		
		return pizza;
	}
	
	//簡單工廠模式 也叫 靜態工廠模式 
	
	public static Pizza createPizza2(String orderType) {

		Pizza pizza = null;

		System.out.println("使用簡單工廠模式2");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" 希臘披薩 ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" 奶酪披薩 ");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("胡椒披薩");
		}
		
		return pizza;
	}

}
