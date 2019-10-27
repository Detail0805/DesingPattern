package com.atguigu.factory.absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza{
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("倫敦的胡椒pizza");
		System.out.println(" 倫敦的胡椒pizza 準備原材料");
	}
}
