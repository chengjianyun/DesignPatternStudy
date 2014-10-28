package study.java.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		// TODO Auto-generated constructor stub
		menuItems=new ArrayList<MenuItem>();
		
		addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs with toast", true, 2.99f);
		addItem("Regular Pancake Breakfast", "Pancake with fired eggs, sausage", false, 2.99f);
		addItem("Blueberry Pancakes", "Pancake made with fresh blueberries", true, 3.49f);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 2.99f);
	}
	
	private void addItem(String name, String description,Boolean vegetarian, float price) {
		// TODO Auto-generated method stub
		MenuItem menuItem=new MenuItem(name, description, vegetarian, price); 
		menuItems.add(menuItem);
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return menuItems.iterator();
	}
}
