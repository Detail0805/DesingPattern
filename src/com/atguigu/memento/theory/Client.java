package com.atguigu.memento.theory;

import java.util.ArrayList;
import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		originator.setState(" 狀態#1 攻擊力 100 ");
		
		//儲存了當前的狀態
		caretaker.add(originator.saveStateMemento());
		
		originator.setState(" 狀態#2 攻擊力 80 ");
		
		caretaker.add(originator.saveStateMemento());
		
		originator.setState(" 狀態#3 攻擊力 50 ");
		caretaker.add(originator.saveStateMemento());
		
		
		
		System.out.println("目前的狀態是 =" + originator.getState());
		
		//希望得到狀態 1, 將 originator 恢復到狀態1
		
		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("恢復到狀態1 , 目前的狀態是");
		System.out.println("目前的狀態是 =" + originator.getState());
		
		
		
	}

}
