package study.java.designpattern.iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
	
	MenuItem[] menuItems;
	int currentIndex=0;
	
	public DinnerMenuIterator(MenuItem[] menuItems) {
		// TODO Auto-generated constructor stub
		this.menuItems=menuItems;
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(currentIndex >= menuItems.length || menuItems[currentIndex]==null)
			return false;
		else 
			return true;
	}

	public Object next() {
		// TODO Auto-generated method stub
		MenuItem item=null;
		if(currentIndex < menuItems.length)
		{
			item = menuItems[currentIndex];
			currentIndex++;
		}
		return item;
	}
}
