package study.java.designpattern.decorator;

public abstract class Beverage {
	public final static int GRANDE=2;
	public final static int VENTI=1;
	public final static int TALL=3;
	String description="Unknow Beverage";
	private int size=2;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public String getDescription() {
		return description;
	}
	public abstract float cost();
	
}
