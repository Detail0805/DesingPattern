package com.atguigu.factory.factorymethod.pizzastore.order;

public class PizzaStore {

	public static void main(String[] args) {
		String loc = "bj";
		if (loc.equals("bj")) {
			//建立北京口味的各種Pizza
			new BJOrderPizza();
		} else {
			//建立倫敦口味的各種Pizza
			new LDOrderPizza();
		}
		// TODO Auto-generated method stub
	}

}
