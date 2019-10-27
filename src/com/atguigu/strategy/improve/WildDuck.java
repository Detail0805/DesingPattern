package com.atguigu.strategy.improve;

public class WildDuck extends Duck {

	
	//構造器，傳入FlyBehavor 的對象
	public  WildDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new GoodFlyBehavior();
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" 這是野鴨 ");
	}

}
