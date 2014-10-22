package study.java.designpattern.observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
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

}
