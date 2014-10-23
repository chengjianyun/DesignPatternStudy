package study.java.designpattern.decorator;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage b) {
		// TODO Auto-generated constructor stub
		beverage=b;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	public float cost() {
		// TODO Auto-generated method stub
		return (float) (.20 + beverage.cost());
	}

}
