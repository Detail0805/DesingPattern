package com.atguigu.observer.improve;

//觀察者介面，有觀察者來實現
public interface Observer {

	public void update(float temperature, float pressure, float humidity);
}
