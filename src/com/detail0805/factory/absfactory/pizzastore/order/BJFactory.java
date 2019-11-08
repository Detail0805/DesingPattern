package com.detail0805.factory.absfactory.pizzastore.order;

import com.detail0805.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.detail0805.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.detail0805.factory.absfactory.pizzastore.pizza.Pizza;

//這是工廠子類
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽像工廠模式~");
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
