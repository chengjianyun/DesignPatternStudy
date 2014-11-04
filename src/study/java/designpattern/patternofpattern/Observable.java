package study.java.designpattern.patternofpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {

	ArrayList<Observer> observers=new ArrayList<Observer>();
	QuackObservable duck;
	
	public Observable(QuackObservable duck) {
		// TODO Auto-generated constructor stub
		this.duck=duck;
	}
	
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			iterator.next().update(duck);
		}
	}

}
