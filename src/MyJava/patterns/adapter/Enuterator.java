package MyJava.patterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class Enuterator implements Iterator {

	private Enumeration enmu;
	
	public Enuterator(Enumeration enmu){
		this.enmu =enmu;
	}
	@Override
	public boolean hasNext() {
		return enmu.hasMoreElements();
	}

	@Override
	public Object next() {
		return enmu.nextElement();
	}
}
