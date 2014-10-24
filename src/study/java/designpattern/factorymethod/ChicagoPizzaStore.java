package study.java.designpattern.factorymethod;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}else
			return null;
	}

}
