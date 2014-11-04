package study.java.designpattern.status;

public class SoldState implements State {

	transient GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine=gumballMachine;
	}
	
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert another quarter");
	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Can't return.");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You have crankd...");
	}

	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		if(gumballMachine.getCount()>0)
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
