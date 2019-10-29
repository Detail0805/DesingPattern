package com.detail0805.observer;

/**
 * 類是核心
 * 1. 包含最新的天氣情況資訊 
 * 2. 含有 CurrentConditions 對像
 * 3. 當數據有更新時，就主動的呼叫   CurrentConditions對像update方法(含 display), 這樣他們（接入方）就看到最新的資訊
 * @author Administrator
 *
 */
public class WeatherData {
	private float temperatrue;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;
	//加入新的第三方

	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}

	public float getTemperature() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void dataChange() {
		//呼叫 接入方的 update
		currentConditions.update(getTemperature(), getPressure(), getHumidity());
	}

	//當數據有更新時，就呼叫 setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//呼叫dataChange， 將最新的資訊 推送給 接入方 currentConditions
		dataChange();
	}
}
