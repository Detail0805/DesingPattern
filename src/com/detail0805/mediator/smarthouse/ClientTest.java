package com.detail0805.mediator.smarthouse;

public class ClientTest {

	public static void main(String[] args) {
		//建立一個中介者對像
		Mediator mediator = new ConcreteMediator();
		
		//建立Alarm 並且加入到  ConcreteMediator 對象的HashMap
		Alarm alarm = new Alarm(mediator, "alarm");
		
		//建立了CoffeeMachine 對象，並  且加入到  ConcreteMediator 對象的HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
				"coffeeMachine");
		
		//建立 Curtains , 並  且加入到  ConcreteMediator 對象的HashMap
		Curtains curtains = new Curtains(mediator, "curtains");
		TV tV = new TV(mediator, "TV");
		
		//讓鬧鐘發出訊息
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}

}
