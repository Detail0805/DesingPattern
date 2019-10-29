package com.detail0805.strategy.improve;

public class ToyDuck extends Duck{

	
	public ToyDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new NoFlyBehavior();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("玩具鴨");
	}

	//需要重寫父類的所有方法
	
	public void quack() {
		System.out.println("玩具鴨不能叫~~");
	}
	
	public void swim() {
		System.out.println("玩具鴨不會游泳~~");
	}
	
	
}
