package com.detail0805.builder.improve;


// 抽像的建造者
public abstract class HouseBuilder {

	protected House house = new House();
	
	//將建造的流程寫好, 抽像的方法
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();
	
	//建造房子好， 將產品(房子) 返回
	public House buildHouse() {
		return house;
	}
	
}
