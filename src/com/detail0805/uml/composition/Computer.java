package com.detail0805.uml.composition;

public class Computer {
	private Mouse mouse = new Mouse(); //滑鼠可以和computer不能分離
	private Moniter moniter = new Moniter();//顯示器可以和Computer不能分離
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}
	
}
