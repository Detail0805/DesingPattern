package com.atguigu.strategy;

public abstract class Duck {

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
		System.out.println("鴨子會飛翔~~~");
	}
	
}
