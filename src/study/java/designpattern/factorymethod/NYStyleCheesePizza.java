package study.java.designpattern.factorymethod;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		// TODO Auto-generated constructor stub
		name="Chicago Style Deep Dish Cheese pizza";
		sauce="Plum Tomato Sauce";
		dough="Extra Thick Crust Dough";
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cutting the Pizza into square slices");
	}
}
