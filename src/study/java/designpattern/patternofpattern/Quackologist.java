package study.java.designpattern.patternofpattern;

public class Quackologist implements Observer {

	public void update(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Quackable){
			Quackable duck=(Quackable)obj;
			System.out.println("Quackologist: "+duck+" just quacked.");
		}
			
	}

}
