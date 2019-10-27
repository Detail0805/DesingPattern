package com.atguigu.facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//這裡直接呼叫。。 很麻煩
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		
		
		homeTheaterFacade.end();
	}

}
