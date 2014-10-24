package study.java.designpattern.factorymethod;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else 
			return null;
	}

}
