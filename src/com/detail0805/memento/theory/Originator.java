package com.detail0805.memento.theory;

public class Originator {

	private String state;//狀態資訊

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//編寫一個方法，可以儲存一個狀態對像 Memento
	//因此編寫一個方法，返回 Memento
	public Memento saveStateMemento() {
		return new Memento(state);
	}
	
	//通過備忘錄對象，恢復狀態
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
