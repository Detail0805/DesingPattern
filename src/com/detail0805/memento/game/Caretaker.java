package com.detail0805.memento.game;

import java.util.ArrayList;
import java.util.HashMap;

//守護者對像, 儲存遊戲角色的狀態
public class Caretaker {

	//如果只儲存一次狀態
	private Memento  memento;
	//對GameRole 儲存多次狀態
	//private ArrayList<Memento> mementos;
	//對多個遊戲角色儲存多個狀態
	//private HashMap<String, ArrayList<Memento>> rolesMementos;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
