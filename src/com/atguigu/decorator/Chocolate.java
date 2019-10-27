package com.atguigu.decorator;

//具體的Decorator， 這裡就是調味品
public class Chocolate extends Decorator {

	public Chocolate(Drink obj) {
		super(obj);
		setDes(" 巧克力 ");
		setPrice(3.0f); // 調味品 的價格
	}

}
