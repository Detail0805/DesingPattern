package com.detail0805.mediator.smarthouse;

public abstract class Mediator {
	//將給中介者對象，加入到集合中
	public abstract void Register(String colleagueName, Colleague colleague);

	//接收訊息, 具體的同事對像發出
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}
