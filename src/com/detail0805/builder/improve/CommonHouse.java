package com.detail0805.builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println(" 普通房子打地基5米 ");
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println(" 普通房子砌墻10cm ");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println(" 普通房子屋頂 ");
	}

}
