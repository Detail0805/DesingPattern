package com.detail0805.bridge;


//摺疊式手機類，繼承 抽像類 Phone
public class FoldedPhone extends Phone {

	//構造器
	public FoldedPhone(Brand brand) {
		super(brand);
	}
	
	public void open() {
		super.open();
		System.out.println(" 摺疊樣式手機 ");
	}
	
	public void close() {
		super.close();
		System.out.println(" 摺疊樣式手機 ");
	}
	
	public void call() {
		super.call();
		System.out.println(" 摺疊樣式手機 ");
	}
}
