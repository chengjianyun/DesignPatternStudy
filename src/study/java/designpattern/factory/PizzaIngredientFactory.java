package study.java.designpattern.factory;

public interface  PizzaIngredientFactory {
	public Sauce getSauce();
	public Clams getClams();
	public Dough getDough();
	public Cheese getCheese();	
}
