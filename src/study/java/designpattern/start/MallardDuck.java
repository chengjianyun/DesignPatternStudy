package study.java.designpattern.start;

public class MallardDuck extends Duck {

	public MallardDuck(){
		flyBehavior=new FlyWithWings();
		quackBehavior=new Quack();
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Mallard Duck!");
	}

}
