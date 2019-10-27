package com.atguigu.uml.aggregation;

public class Computer {
	private Mouse mouse; //滑鼠可以和computer分離
	private Moniter moniter;//顯示器可以和Computer分離
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}
	
}
