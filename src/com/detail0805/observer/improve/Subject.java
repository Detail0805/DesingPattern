package com.detail0805.observer.improve;

//介面, 讓WeatherData 來實現 
public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
