package MyJava.patterns.iterator;

import java.util.Vector;

public abstract class Purchase {
	private Vector elements = new Vector(5);
	public abstract Iterator createIterator();
	public void append(Object obj){
		elements.addElement(obj);
	}
	public void remove(Object obj){
		elements.removeElement(obj);
	}
	public Object currentItem(int n){
		return elements.elementAt(n);
	}
	public int count(){
		return elements.size();
	}
}
