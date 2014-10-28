package study.java.designpattern.iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu{
	static final int MAX_ITEMS=6;
	int numberOfItems=0;
	MenuItem[] menuItems;
	DinnerMenuIterator iterator;
	public DinnerMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99f);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat ", true, 2.99f);
		addItem("Soup of day", "Soup of day, with a side of potato salad", false, 3.29f);
		addItem("Hotdog", "A hot dog, with saurkrant, relish, onions, topped with cheese", false, 3.05f);
	}
	
	private void addItem(String name, String description,Boolean vegetarian, float price) {
		// TODO Auto-generated method stub
		MenuItem menuItem=new MenuItem(name, description, vegetarian, price);
		if(numberOfItems>=MAX_ITEMS){
			System.err.println("Sorry, menu is full! Can't add item to menu");
		}else {
			menuItems[numberOfItems]=menuItem;
			numberOfItems++;
		}
		
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		iterator=new DinnerMenuIterator(menuItems);
		return iterator;
	}
}
