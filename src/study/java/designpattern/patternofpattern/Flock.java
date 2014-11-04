package study.java.designpattern.patternofpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

	ArrayList<Quackable> ducks=new ArrayList<Quackable>();
	ArrayList<Observer> observers=new ArrayList<Observer>();
	
	public void add(Quackable duck) {
		ducks.add(duck);
	}
	public void quack() {
		// TODO Auto-generated method stub
		Iterator<Quackable> iterator=ducks.iterator();
		while (iterator.hasNext()) {
			iterator.next().quack();			
		}
	}
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			iterator.next().update(this);
		}
	}

}
