package study.java.designpattern.singleton;

public class Singleton {
	private static Singleton instanceSingleton;
	
	//use for multi-thread safe
//	private static Singleton instanceSingleton=new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(instanceSingleton == null)
			instanceSingleton=new Singleton();
		return instanceSingleton;
	}
	
/*	multithread safe method
 * public static synchronized Singleton getInstance() {
		if(instanceSingleton == null)
			instanceSingleton=new Singleton();
		return instanceSingleton;
	}*/
}
