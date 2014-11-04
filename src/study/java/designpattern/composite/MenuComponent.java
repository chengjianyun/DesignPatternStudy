package study.java.designpattern.composite;

import java.util.Iterator;

public abstract class MenuComponent {
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String getDescritpion() {
		throw new UnsupportedOperationException();
	}
	
	public float getPrice() {
		throw new UnsupportedOperationException();
	}
	public Boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	public void add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}
	public Boolean remove(MenuComponent component) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int position) {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	public Iterator iterator() {
		throw new UnsupportedOperationException();
	}
	
}
