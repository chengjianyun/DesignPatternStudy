package study.java.main;

import study.java.designpattern.observer.CurrentConditionsDisplay;
import study.java.designpattern.observer.WeatherData;
import study.java.designpattern.strategy.Duck;
import study.java.designpattern.strategy.MallardDuck;

public class JavaProgramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this is strategy test sample
//		Duck duck=new MallardDuck();
//		
//		duck.display();
//		duck.performFly();
//		duck.performFly();
//		duck.swim();
		
		//this is observer pattern test code
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay conditionsDisplay=new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(0, 30, 50);
		weatherData.setMeasurements(80, 70, 30);
	}

}
