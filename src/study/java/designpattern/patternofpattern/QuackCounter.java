package study.java.designpattern.patternofpattern;

public class QuackCounter implements Quackable {
	
	Quackable duck;
	static int count=0;
	Observable observable;
	
	public QuackCounter(Quackable duck) {
		// TODO Auto-generated constructor stub
		this.duck=duck;
	}
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		count++;
	}
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		observable.notifyAllObservers();
	}

}
