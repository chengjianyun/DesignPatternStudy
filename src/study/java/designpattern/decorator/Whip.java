package study.java.designpattern.decorator;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip";
	}

	public float cost() {
		// TODO Auto-generated method stub
		return  (float) (beverage.cost()+ 0.10);
	}

}
