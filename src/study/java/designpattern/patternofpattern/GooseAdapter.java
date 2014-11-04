package study.java.designpattern.patternofpattern;

public class GooseAdapter implements Quackable {
	
	Goose choose;
	Observable observable;
	
	public GooseAdapter(Goose choose) {
		// TODO Auto-generated constructor stub
		this.choose=choose;
		observable=new Observable(this);
	}
	public void quack() {
		// TODO Auto-generated method stub
		choose.honk();
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
