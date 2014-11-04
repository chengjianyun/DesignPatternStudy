package study.java.designpattern.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	
	String name;
	String description;
	Boolean vegeterin;
	float price;
	
	public MenuItem(String name, String description, Boolean vegeterin,
			float price) {
		this.name = name;
		this.description = description;
		this.vegeterin = vegeterin;
		this.price = price;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public String getDescritpion() {
		// TODO Auto-generated method stub
		return description;
	}
	
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	@Override
	public Boolean isVegetarian() {
		// TODO Auto-generated method stub
		return vegeterin;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(name+" ,");
		System.out.print(price+"--");
		System.out.println(description);
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}
}
