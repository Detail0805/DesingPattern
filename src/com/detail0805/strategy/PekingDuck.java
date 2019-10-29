package com.detail0805.strategy;

public class PekingDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("~~北京鴨~~~");
	}
	
	//因為北京鴨不能飛翔，因此需要重寫fly
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("北京鴨不能飛翔");
	}

}
