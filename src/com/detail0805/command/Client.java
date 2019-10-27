package com.atguigu.command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//使用命令設計模式，完成通過遙控器，對電燈的操作
		
		//建立電燈的對象(接受者)
		LightReceiver lightReceiver = new LightReceiver();
		
		//建立電燈相關的開關命令
		LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
		LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
		
		//需要一個遙控器
		RemoteController remoteController = new RemoteController();
		
		//給我們的遙控器設定命令, 比如 no = 0 是電燈的開和關的操作
		remoteController.setCommand(0, lightOnCommand, lightOffCommand);
		
		System.out.println("--------按下燈的開按鈕-----------");
		remoteController.onButtonWasPushed(0);
		System.out.println("--------按下燈的關按鈕-----------");
		remoteController.offButtonWasPushed(0);
		System.out.println("--------按下撤銷按鈕-----------");
		remoteController.undoButtonWasPushed();
		
		
		System.out.println("=========使用遙控器操作電視機==========");
		
		TVReceiver tvReceiver = new TVReceiver();
		
		TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
		TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
		
		//給我們的遙控器設定命令, 比如 no = 1 是電視機的開和關的操作
		remoteController.setCommand(1, tvOnCommand, tvOffCommand);
		
		System.out.println("--------按下電視機的開按鈕-----------");
		remoteController.onButtonWasPushed(1);
		System.out.println("--------按下電視機的關按鈕-----------");
		remoteController.offButtonWasPushed(1);
		System.out.println("--------按下撤銷按鈕-----------");
		remoteController.undoButtonWasPushed();

	}

}
