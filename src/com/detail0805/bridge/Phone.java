package com.detail0805.bridge;

public abstract class Phone {
	
	//組合品牌
	private Brand brand;

	//構造器
	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}
	
	protected void open() {
		this.brand.open();
	}
	protected void close() {
		brand.close();
	}
	protected void call() {
		brand.call();
	}
	
}
