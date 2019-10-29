package com.detail0805.observer.improve;

import java.util.ArrayList;

/**
 * 類是核心
 * 1. 包含最新的天氣情況資訊 
 * 2. 含有 觀察者集合，使用ArrayList管理
 * 3. 當數據有更新時，就主動的呼叫   ArrayList, 通知所有的（接入方）就看到最新的資訊
 * @author Administrator
 *
 */
public class WeatherData implements Subject {
	private float temperatrue;
	private float pressure;
	private float humidity;
	//觀察者集合
	private ArrayList<Observer> observers;
	
	//加入新的第三方

	public WeatherData() {
		observers = new ArrayList<Observer>();
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
		
		notifyObservers();
	}

	//當數據有更新時，就呼叫 setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//呼叫dataChange， 將最新的資訊 推送給 接入方 currentConditions
		dataChange();
	}

	//註冊一個觀察者
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	//移除一個觀察者
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if(observers.contains(o)) {
			observers.remove(o);
		}
	}

	//遍歷所有的觀察者，並通知
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0; i < observers.size(); i++) {
			observers.get(i).update(this.temperatrue, this.pressure, this.humidity);
		}
	}
}
