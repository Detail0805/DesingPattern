package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

//一個抽像工廠模式的抽像層(介面)
public interface AbsFactory {
	//讓下面的工廠子類來 具體實現
	public Pizza createPizza(String orderType);
}
