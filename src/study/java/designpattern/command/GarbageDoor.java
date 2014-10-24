package study.java.designpattern.command;

public class GarbageDoor {
	public void up(){
		System.out.println("Garbage door is open.");
	}
	public void down(){
		System.out.println("Garbage door is close.");
	}
	public void stop(){
		System.out.println("Garbage door is stop.");
	}
	public void lightOn(){
		System.out.println("Garbage door light is open.");
	}
	public void lightOff(){
		System.out.println("Garbage door light is close.");
	}
}
