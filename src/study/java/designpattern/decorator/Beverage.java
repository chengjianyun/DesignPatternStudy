package study.java.designpattern.decorator;

public abstract class Beverage {
	String description="Unknow Beverage";
	public String getDescription() {
		return description;
	}
	public abstract float cost();
}
