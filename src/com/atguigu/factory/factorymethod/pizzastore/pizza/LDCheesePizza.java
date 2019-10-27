package com.atguigu.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("倫敦的奶酪pizza");
		System.out.println(" 倫敦的奶酪pizza 準備原材料");
	}
}
