package study.java.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

	Stack<Iterator> stack = new Stack<Iterator>();

	public CompositeIterator(Iterator iterator) {
		// TODO Auto-generated constructor stub
		stack.add(iterator);
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (stack.empty())
			return false;
		else {
			Iterator iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	public Object next() {
		// TODO Auto-generated method stub
		if (hasNext()) {
			Iterator iterator = stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu)
				stack.push(component.iterator());
			return component;
		} else {
			return null;
		}
	}
}
