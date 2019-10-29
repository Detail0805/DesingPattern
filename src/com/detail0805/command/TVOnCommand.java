package com.detail0805.command;

public class TVOnCommand implements Command {

	// 聚合TVReceiver

	TVReceiver tv;

	// 構造器
	public TVOnCommand(TVReceiver tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// 呼叫接收者的方法
		tv.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		// 呼叫接收者的方法
		tv.off();
	}
}
