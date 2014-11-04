package study.java.designpattern.status;

import java.util.Random;

public class HasQuarterState implements State{

	transient GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine _gumballMachine) {
		// TODO Auto-generated constructor stub
		gumballMachine=_gumballMachine;
	}
	
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Has returned a quarter.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You have inserted a quarter, please turn crank.");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Crank turned.");
		int r=new Random().nextInt(100);
		if(r<10 && gumballMachine.getCount()>1)
			gumballMachine.setState(gumballMachine.getWinnerState());
		else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");
	}
}
