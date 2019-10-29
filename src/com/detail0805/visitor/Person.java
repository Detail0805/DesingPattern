package com.detail0805.visitor;

public abstract class Person {
	
	//提供一個方法，讓訪問者可以訪問
	public abstract void accept(Action action);
}
