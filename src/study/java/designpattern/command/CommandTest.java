package study.java.designpattern.command;

import study.java.main.Test;

public class CommandTest implements Test {
	
	RemoteController remoteController;
	GarbageDoor garbageDoor;
	GarbageDoorOpenCommand gCommand;
	
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
