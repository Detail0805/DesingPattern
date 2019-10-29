package com.detail0805.observer.improve;

public class CurrentConditions implements Observer {

	// 溫度，氣壓，濕度
	private float temperature;
	private float pressure;
	private float humidity;

	// 更新 天氣情況，是由 WeatherData 來呼叫，我使用推送模式
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	// 顯示
	public void display() {
		System.out.println("***Today mTemperature: " + temperature + "***");
		System.out.println("***Today mPressure: " + pressure + "***");
		System.out.println("***Today mHumidity: " + humidity + "***");
	}
}
