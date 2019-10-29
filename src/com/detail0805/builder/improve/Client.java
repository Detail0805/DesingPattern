package com.detail0805.builder.improve;

public class Client {
	public static void main(String[] args) {
		
		//蓋普通房子
		CommonHouse commonHouse = new CommonHouse();
		//準備建立房子的指揮者
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		
		//完成蓋房子，返回產品(普通房子)
		House house = houseDirector.constructHouse();
		
		//System.out.println("輸出流程");
		
		System.out.println("--------------------------");
		//蓋高樓
		HighBuilding highBuilding = new HighBuilding();
		//重置建造者
		houseDirector.setHouseBuilder(highBuilding);
		//完成蓋房子，返回產品(高樓)
		houseDirector.constructHouse();
		
		
		
	}
}
