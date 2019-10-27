package com.atguigu.factory.absfactory.pizzastore.pizza;

//將Pizza 類做成抽像
public abstract class Pizza {
	protected String name; //名字

	//準備原材料, 不同的披薩不一樣，因此，我們做成抽像方法
	public abstract void prepare();

	
	public void bake() {
		System.out.println(name + " baking;");
	}

	public void cut() {
		System.out.println(name + " cutting;");
	}

	//打包
	public void box() {
		System.out.println(name + " boxing;");
	}

	public void setName(String name) {
		this.name = name;
	}
}
