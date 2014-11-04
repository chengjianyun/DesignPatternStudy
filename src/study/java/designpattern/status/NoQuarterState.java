package study.java.designpattern.status;

public class NoQuarterState implements State {
	transient GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine=gumballMachine;
	}

	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You inserted a quarter.");
		gumballMachine.setState(gumballMachine.getHashQuarterState());
	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You haven't insert a quarter.");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there's no quarter.");
	}

	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You should pay first.");
	}
}
