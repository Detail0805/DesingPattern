package com.detail0805.observer;

public class Client {
	public static void main(String[] args) {
		//建立接入方 currentConditions
		CurrentConditions currentConditions = new CurrentConditions();
		//建立 WeatherData 並將 接入方 currentConditions 傳遞到 WeatherData中
		WeatherData weatherData = new WeatherData(currentConditions);
		
		//更新天氣情況
		weatherData.setData(30, 150, 40);
		
		//天氣情況變化
		System.out.println("============天氣情況變化=============");
		weatherData.setData(40, 160, 20);
		

	}
}
