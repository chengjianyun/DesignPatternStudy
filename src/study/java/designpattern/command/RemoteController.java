package study.java.designpattern.command;

public class RemoteController {
	Command command;
	
	public void setCommand(Command _com){
		command=_com;
	}
	
	public void invoke(){
		command.execute();
	}
}
