package com.detail0805.factory.factorymethod.pizzastore.order;

import com.detail0805.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.detail0805.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.detail0805.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
