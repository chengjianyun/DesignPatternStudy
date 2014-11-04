package study.java.designpattern.patternofpattern;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyAllObservers();
}
