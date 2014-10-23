package study.java.designpattern.observer;

import java.util.ArrayList;
import java.util.Observable;

//public class WeatherData implements Subject {
//
//	ArrayList observers;
//	
//	private float temperature;
//	private float humidity;
//	private float pressure;
//	
//	public WeatherData() {
//		// TODO Auto-generated constructor stub
//		observers=new ArrayList();
//	}
//	
//	public void setTemperature(float temperature) {
//		this.temperature = temperature;
//	}
//
//	public void setHumidity(float humidity) {
//		this.humidity = humidity;
//	}
//
//	public void setPressure(float pressure) {
//		this.pressure = pressure;
//	}
//
//	public float getTemperature() {
//		return 0;
//	}
//	
//	public float getHumidity() {
//		return 0;
//	}
//	
//	public float getPressure() {
//		return 0;
//	}
//	
//	public void measurementsChanged() {
//		notifyObservers();
//	}
//	
//	public void registerObserver(Observer o) {
//		// TODO Auto-generated method stub
//		observers.add(o);
//	}
//
//	public void removeObserver(Observer o) {
//		// TODO Auto-generated method stub
//		observers.remove(o);
//	}
//
//	public void notifyObservers() {
//		// TODO Auto-generated method stub
//		for(int i=0;i<observers.size();i++){
//			Observer itemObserver = (Observer)observers.get(i);
//			itemObserver.update(temperature, humidity, pressure);
//		}
//	}
//	
//	public void setMeasurements(float temperature,float humidity,float pressure) {
//		setHumidity(humidity);
//		setPressure(pressure);
//		setTemperature(temperature);
//		measurementsChanged();
//	}
//
//}

public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getTemperature() {
		return 0;
	}
	
	public float getHumidity() {
		return 0;
	}
	
	public float getPressure() {
		return 0;
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		setHumidity(humidity);
		setPressure(pressure);
		setTemperature(temperature);
		measurementsChanged();
	}

}
