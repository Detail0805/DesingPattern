package com.detail0805.command;

public class LightOnCommand implements Command {

	//聚合LightReceiver
	
	LightReceiver light;
	
	//構造器
	public LightOnCommand(LightReceiver light) {
		super();
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		//呼叫接收者的方法
		light.on();
	}

	

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		//呼叫接收者的方法
		light.off();
	}

}
