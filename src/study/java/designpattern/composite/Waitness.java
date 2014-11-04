package study.java.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitness {
	MenuComponent allMenus;
	
	public Waitness(MenuComponent _menus) {
		// TODO Auto-generated constructor stub
		allMenus=_menus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	public void printBreakfastMenu() {
		
	}
	
	public void printLunchMenu() {
		
	}
	
	public void printVegetarianMenu() {
		Iterator iterator = (CompositeIterator)allMenus.iterator();
		while(iterator.hasNext()) {
			MenuComponent component=(MenuComponent)iterator.next();
			try {
				if(component.isVegetarian()){
					component.print();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
	
	public Boolean isItemVegetarin(MenuItem item) {
		return item.vegeterin;
	}
}
