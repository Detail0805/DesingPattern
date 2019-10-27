package com.atguigu.command;

/**
 * 沒有任何命令，即空執行: 用於初始化每個按鈕, 當呼叫空命令時，對像什麼都不做
 * 其實，這樣是一種設計模式, 可以省掉對空判斷
 * @author Administrator
 *
 */
public class NoCommand implements Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
