package com.detail0805.builder;

public abstract class AbstractHouse {
	
	//打地基
	public abstract void buildBasic();
	//砌墻
	public abstract void buildWalls();
	//封頂
	public abstract void roofed();
	
	public void build() {
		buildBasic();
		buildWalls();
		roofed();
	}
	
}
