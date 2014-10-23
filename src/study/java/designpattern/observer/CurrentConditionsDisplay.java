package study.java.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

	private float temperature;
	private float humidity;
	private Observable weatherData;
	
	public CurrentConditionsDisplay(Observable weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData=weatherData;
		this.weatherData.addObserver(this);
	}
	
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		temperature=temp;
		this.humidity=humidity;
		display();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: "+temperature+"F Degrees and "+humidity+"% humidity");
	}

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if(arg0 instanceof WeatherData){
			temperature=((WeatherData) arg0).getTemperature();
			humidity=((WeatherData) arg0).getHumidity();
		}
	}

}
