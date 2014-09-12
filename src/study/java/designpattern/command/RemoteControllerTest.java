package study.java.designpattern.command;

public class RemoteControllerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteController remoteController=new RemoteController();
		GarbageDoor garbageDoor=new GarbageDoor();
		GarbageDoorOpenCommand gCommand=new GarbageDoorOpenCommand(garbageDoor);
		
		remoteController.setCommand(gCommand);
		remoteController.invoke();
	}

}
