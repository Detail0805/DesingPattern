package com.detail0805.composite;

public class Department extends OrganizationComponent {

	//沒有集合
	
	public Department(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}

	
	//add , remove 就不用寫了，因為他是葉子節點
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}
	
	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.println(getName());
	}

}
