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
		float cost=beverage.cost();
		if(getSize()==Beverage.TALL){
			return  (float) (beverage.cost()+ 0.10);
		}
		if(getSize()==Beverage.VENTI){
			return  (float) (beverage.cost()+ 0.20);
		}
		if(getSize()==Beverage.GRANDE){
			return  (float) (beverage.cost()+ 0.15);
		}
		return cost;
	}

}
