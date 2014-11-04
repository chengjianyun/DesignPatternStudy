package study.java.designpattern.status;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import study.java.designpattern.proxy.GumballManchineRemote;

public class GumballMachine extends UnicastRemoteObject implements GumballManchineRemote {
	State state;

	SoldOutState soldOutState;
	NoQuarterState noQuarterState;
	HasQuarterState hashQuarterState;
	SoldState soldState;
	WinnerState winnerState;
	

	public WinnerState getWinnerState() {
		return winnerState;
	}

	int count = 0;
	String location;

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public State getState() {
		return state;
	}

	public SoldOutState getSoldOutState() {
		return soldOutState;
	}

	public NoQuarterState getNoQuarterState() {
		return noQuarterState;
	}

	public HasQuarterState getHashQuarterState() {
		return hashQuarterState;
	}

	public SoldState getSoldState() {
		return soldState;
	}

	public GumballMachine(int numberGumballs) throws RemoteException {
		// TODO Auto-generated constructor stub
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		noQuarterState = new NoQuarterState(this);
		hashQuarterState = new HasQuarterState(this);
		this.count = numberGumballs;
		if (count > 0)
			state = noQuarterState;
		else {
			state = soldOutState;
		}
	}
	
	public GumballMachine(String location, int numberGumballs) throws RemoteException {
		// TODO Auto-generated constructor stub
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		noQuarterState = new NoQuarterState(this);
		hashQuarterState = new HasQuarterState(this);
		this.count = numberGumballs;
		if (count > 0)
			state = noQuarterState;
		else {
			state = soldOutState;
		}
		this.location=location;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		// TODO Auto-generated method stub
		this.state = state;
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	private void refill(int numberGumball) {
		count=numberGumball;
		state=noQuarterState;
	}

	public String getLocation() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}
