package com.atguigu.observer.improve;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立一個WeatherData
		WeatherData weatherData = new WeatherData();
		
		//建立觀察者
		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite = new BaiduSite();
		
		//註冊到weatherData
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);
		
		//測試
		System.out.println("通知各個註冊的觀察者, 看看資訊");
		weatherData.setData(10f, 100f, 30.3f);
		
		
		weatherData.removeObserver(currentConditions);
		//測試
		System.out.println();
		System.out.println("通知各個註冊的觀察者, 看看資訊");
		weatherData.setData(10f, 100f, 30.3f);
	}

}
