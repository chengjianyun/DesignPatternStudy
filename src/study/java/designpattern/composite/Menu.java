package study.java.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> components;
	String name;
	
	public Menu() {
		// TODO Auto-generated constructor stub
		components=new ArrayList<MenuComponent>();
	}
	
	public Menu(String name, String description) {
		components=new ArrayList<MenuComponent>();
		this.name = name;
		this.description = description;
	}

	String description;
	

	
	@Override
	public void add(MenuComponent component) {
		// TODO Auto-generated method stub
		components.add(component);
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
	public MenuComponent getChild(int position) {
		// TODO Auto-generated method stub
		return components.get(position);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("\n" + getName());
		System.out.print("," + getDescritpion());
		System.out.println("------------------------");
		Iterator<MenuComponent> iterator=components.iterator();
		while(iterator.hasNext()){
			iterator.next().print();
		}
	}
	
	@Override
	public Boolean remove(MenuComponent component) {
		// TODO Auto-generated method stub
		return components.remove(components);
	}		
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new CompositeIterator(components.iterator());
	}
}
