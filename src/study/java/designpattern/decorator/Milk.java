package study.java.designpattern.decorator;

public class Milk extends CondimentDecorator {

	Beverage beverage;
	
	public Milk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Milk";
	}

	public float cost() {
		// TODO Auto-generated method stub
		return  (float) (beverage.cost()+ 0.10);
	}

}
