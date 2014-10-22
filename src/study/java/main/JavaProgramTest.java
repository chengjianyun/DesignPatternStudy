package study.java.main;

import study.java.designpattern.strategy.Duck;
import study.java.designpattern.strategy.MallardDuck;

public class JavaProgramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck=new MallardDuck();
		
		duck.display();
		duck.performFly();
		duck.performFly();
		duck.swim();
	}

}
