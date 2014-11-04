package study.java.main;

import java.rmi.Naming;

import study.java.designpattern.composite.Menu;
import study.java.designpattern.composite.MenuComponent;
import study.java.designpattern.composite.MenuItem;
import study.java.designpattern.composite.Waitness;
import study.java.designpattern.decorator.Beverage;
import study.java.designpattern.decorator.DarkRoast;
import study.java.designpattern.decorator.Espresso;
import study.java.designpattern.decorator.Mocha;
import study.java.designpattern.decorator.Whip;
import study.java.designpattern.patternofpattern.Quackologist;
import study.java.designpattern.status.GumballMachine;

public class JavaProgramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is decorator test code
//		Beverage beverage = new Espresso();
//		System.out.println(beverage.getDescription()+" $"+beverage.cost());
//		
//		Beverage beverage2=new DarkRoast();
//		beverage2=new Mocha(beverage2);
//		beverage2=new Mocha(beverage2);
//		beverage2=new Whip(beverage2);
//		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
//		MenuComponent pancakeHouseMenu=new Menu("PANCAKE HOUSE MENU","Breakfast");
//		MenuComponent dinnerMenu=new Menu("DINNER MENU","Lunch");
//		MenuComponent cafeMenu=new Menu("CAFE MENU","Dinner");
//		MenuComponent dessertMenu=new Menu("DESSERT MENU","Dessert of course!");
//		
//		MenuComponent allMenus=new Menu("ALL MENUS", "All menus combiend");
//		
//		allMenus.add(pancakeHouseMenu);
//		allMenus.add(dinnerMenu);
//		allMenus.add(cafeMenu);
//		allMenus.add(dessertMenu);
//		
//		dinnerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99f));
//		dinnerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat ", true, 2.99f));		
//		dinnerMenu.add(new MenuItem("Soup of day", "Soup of day, with a side of potato salad", false, 3.29f));
//		dinnerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkrant, relish, onions, topped with cheese", false, 3.05f));
//		
//		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs with toast", true, 2.99f));
//		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancake with fired eggs, sausage", false, 2.99f));
//		pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancake made with fresh blueberries", true, 3.49f));
//		pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 2.99f));
//		
//		cafeMenu.add(new MenuItem("Mocha Cafe", "Coffee with Moca", true, 3.0f));
//		cafeMenu.add(new MenuItem("EPRESSO", "EPRESSO Coffee", true, 3.2f));
//		cafeMenu.add(new MenuItem("macchiato", "macchiato Coffee", true, 3.f));
//		
//		dessertMenu.add(new MenuItem("Banana cake", "A dessert with Banana tast", true, 2.0f));
//		dessertMenu.add(new MenuItem("chocolate muffin", "Dessert with chocolate tast", true, 2.5f));
//		
//		Waitness waitness=new Waitness(allMenus);
//		waitness.printMenu();
//		
//		System.out.println("\nVegetarian Menu:");
//		waitness.printVegetarianMenu();
		
		//proxy pattern test
		
//		GumballMachine gumballMachine=null;
//		int count;
//		if(args.length<2){
//			System.out.println("GumballMachine <name> <inventory>");
//			System.exit(1);
//		}
//		
//		try{
//			count=Integer.parseInt(args[1]);
//			
//			gumballMachine=new GumballMachine(args[0], count);
//			Naming.rebind("//"+args[0]+"/gumballmanchine", gumballMachine);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
		Quackologist quackologist = new Quackologist();
		
		
	}
}