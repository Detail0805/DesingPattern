package com.detail0805.strategy.improve;

public abstract class Duck {

	//屬性, 策略介面
	FlyBehavior flyBehavior;
	//其它屬性<->策略介面
	QuackBehavior quackBehavior;
	
	public Duck() {
	
	}

	public abstract void display();//顯示鴨子資訊
	
	public void quack() {
		System.out.println("鴨子嘎嘎叫~~");
	}
	
	public void swim() {
		System.out.println("鴨子會游泳~~");
	}
	
	public void fly() {
		
		//改進
		if(flyBehavior != null) {
			flyBehavior.fly();
		}
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
	
}
