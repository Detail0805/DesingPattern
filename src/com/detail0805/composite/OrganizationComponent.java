package com.atguigu.composite;

public abstract class OrganizationComponent {

	private String name; // 名字
	private String des; // 說明
	
	protected  void add(OrganizationComponent organizationComponent) {
		//預設實現
		throw new UnsupportedOperationException();
	}
	
	protected  void remove(OrganizationComponent organizationComponent) {
		//預設實現
		throw new UnsupportedOperationException();
	}

	//構造器
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
	//方法print, 做成抽像的, 子類都需要實現
	protected abstract void print();
	
	
}
