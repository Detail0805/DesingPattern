package com.detail0805.strategy.improve;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();//
		
		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();
		
		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();
		
		//動態改變某個對象的行為, 北京鴨 不能飛
		pekingDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("北京鴨的實際飛翔能力");
		pekingDuck.fly();
	}

}
