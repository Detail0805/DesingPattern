package com.detail0805.command;


//建立命令介面
public interface Command {

	//執行動作(操作)
	public void execute();
	//撤銷動作(操作)
	public void undo();
}
