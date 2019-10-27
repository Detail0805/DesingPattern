package com.atguigu.mediator.smarthouse;

//具體的同事類
public class Alarm extends Colleague {

	//構造器
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
		//在建立Alarm 同事對像時，將自己放入到ConcreteMediator 對像中[集合]
		mediator.Register(name, this);
	}

	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {
		// TODO Auto-generated method stub
		//呼叫的中介者對象的getMessage
		this.GetMediator().GetMessage(stateChange, this.name);
	}

}
