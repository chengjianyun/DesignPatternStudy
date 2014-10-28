package study.java.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitness {
	ArrayList<Menu> menus;
	
	public Waitness(ArrayList<Menu> _menus) {
		// TODO Auto-generated constructor stub
		this.menus=_menus;
	}
	
	public void printMenu() {
		for (Menu menu : menus) {
			Iterator iterator = menu.iterator();
			while(iterator.hasNext()){
				MenuItem item=(MenuItem)iterator.next();
				System.out.print(item.getName()+" ,");
				System.out.print(item.getPrice()+"--");
				System.out.println(item.getDescription());
			}
		}
	}
	
	public void printBreakfastMenu() {
		
	}
	
	public void printLunchMenu() {
		
	}
	
	public void printVegetarianMenu() {
		
	}
	
	public Boolean isItemVegetarin(MenuItem item) {
		return item.vegeterin;
	}
}
