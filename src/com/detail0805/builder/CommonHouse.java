package com.detail0805.builder;

public class CommonHouse extends AbstractHouse {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println(" 普通房子打地基 ");
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println(" 普通房子砌墻 ");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println(" 普通房子封頂 ");
	}

}
