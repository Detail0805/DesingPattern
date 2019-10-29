package com.detail0805.command;

public class LightOffCommand implements Command {

	// 聚合LightReceiver

	LightReceiver light;

	// 構造器
	public LightOffCommand(LightReceiver light) {
			super();
			this.light = light;
		}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// 呼叫接收者的方法
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		// 呼叫接收者的方法
		light.on();
	}
}
