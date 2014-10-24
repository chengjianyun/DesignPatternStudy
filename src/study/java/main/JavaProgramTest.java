package study.java.main;

import study.java.designpattern.decorator.Beverage;
import study.java.designpattern.decorator.DarkRoast;
import study.java.designpattern.decorator.Espresso;
import study.java.designpattern.decorator.Mocha;
import study.java.designpattern.decorator.Whip;

public class JavaProgramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is decorator test code
		Beverage beverage = new Espresso(2);
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
		Beverage beverage2=new DarkRoast(2);	
		beverage2=new Mocha(beverage2);
		beverage2=new Mocha(beverage2);
		beverage2=new Whip(beverage2);
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
	}

}
