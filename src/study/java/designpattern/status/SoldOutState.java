package study.java.designpattern.status;

public class SoldOutState implements State {

	transient GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine=gumballMachine;
	}
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, out of gumballs!");
	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, out of gumballs!");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, out of gumballs!");
	}

	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, out of gumballs!");
	}

}
