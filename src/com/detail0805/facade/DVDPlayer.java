package com.detail0805.facade;

public class DVDPlayer {
	
	//使用單例模式, 使用餓漢式
	private static DVDPlayer instance = new DVDPlayer();
	
	public static DVDPlayer getInstanc() {
		return instance;
	}
	
	public void on() {
		System.out.println(" dvd on ");
	}
	public void off() {
		System.out.println(" dvd off ");
	}
	
	public void play() {
		System.out.println(" dvd is playing ");
	}
	
	//....
	public void pause() {
		System.out.println(" dvd pause ..");
	}
}
