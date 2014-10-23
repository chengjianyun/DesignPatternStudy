package study.java.designpattern.command;

import java.util.Observable;

import study.java.main.Test;

public class CommandTest implements Test {
	
	RemoteController remoteController;
	GarbageDoor garbageDoor;
	GarbageDoorOpenCommand gCommand;
	private Observable aObservable;
	
	public CommandTest() {
		// TODO Auto-generated constructor stub
		remoteController=new RemoteController();
		garbageDoor=new GarbageDoor();
		gCommand=new GarbageDoorOpenCommand(garbageDoor);
	}
	public void inital() {
		// TODO Auto-generated method stub

	}

	public void doTest() {
		// TODO Auto-generated method stub		
		remoteController.setCommand(gCommand);
		remoteController.invoke();
	}
}
