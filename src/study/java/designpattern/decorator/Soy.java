package study.java.designpattern.decorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

	public float cost() {
		// TODO Auto-generated method stub
		return  (float) (beverage.cost()+ 0.15);
	}

}
