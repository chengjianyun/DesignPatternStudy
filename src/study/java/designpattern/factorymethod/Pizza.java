package study.java.designpattern.factorymethod;

import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String sauce;
	String dough;
	ArrayList toppings=new ArrayList();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350 degree");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in offical PizzaStore box");
	}
	
	public void prepare(){
		System.out.println("prepare "+name);
		System.out.println("Tossing dough... ");
		System.out.println("Adding sauce... ");
		System.out.println("Adding toppings: ");
		for(int i=0;i<toppings.size();i++){
			System.out.println(" "+toppings.get(i));
		}
	}
}
