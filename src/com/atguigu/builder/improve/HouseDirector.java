package com.atguigu.builder.improve;

//指揮者，這裡去指定製作流程，返回產品
public class HouseDirector {
	
	HouseBuilder houseBuilder = null;

	//構造器傳入 houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//通過setter 傳入 houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	//如何處理建造房子的流程，交給指揮者
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}
	
	
}
