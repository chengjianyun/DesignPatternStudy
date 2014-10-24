package study.java.designpattern.command;

public class GarbageDoorOpenCommand implements Command {
	
	private GarbageDoor _garbageDoor;
	public GarbageDoorOpenCommand(GarbageDoor garbageDoor){
		_garbageDoor=garbageDoor;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		_garbageDoor.up();
	}

}
