package study.java.designpattern.status;

public class WinnerState implements State {

	transient GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine=gumballMachine;
	}
	
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Can't recieve quarter now!");
	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Preparing gumball, can't return quarter");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You have turned crank");
	}

	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount()>0){
			gumballMachine.releaseBall();
			if(gumballMachine.getCount()>0)
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			else {
				System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
		else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
