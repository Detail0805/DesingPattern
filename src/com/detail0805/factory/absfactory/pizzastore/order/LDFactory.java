package com.detail0805.factory.absfactory.pizzastore.order;

import com.detail0805.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.detail0805.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.detail0805.factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽像工廠模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
