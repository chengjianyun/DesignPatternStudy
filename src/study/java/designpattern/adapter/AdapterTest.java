package study.java.designpattern.adapter;

import java.util.ArrayList;

import study.java.main.Test;

public class AdapterTest implements Test{
	private ArrayList testArray;
	IteratorEnumeration ieEnumeration;
	
	public AdapterTest() {
		testArray= new ArrayList();
		ieEnumeration =new IteratorEnumeration(testArray.iterator());
	}
	
	public void inital() {
		testArray.add("adc");
		testArray.add("abcd");
	}
	
	public void doTest() {
		// TODO Auto-generated method stub
		inital();
		System.out.println(ieEnumeration.nextElement());
		System.out.println(ieEnumeration.nextElement());
	}
}
