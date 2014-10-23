package study.java.designpattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {
	Iterator iterator;

	public IteratorEnumeration(Iterator iterator) {
		// TODO Auto-generated constructor stub
		this.iterator=iterator;
	}
	
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		iterator.hasNext();
		return false;
	}

	public Object nextElement() {
		// TODO Auto-generated method stub
		iterator.next();
		return null;
	}

}
