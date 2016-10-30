package MyJava.patterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class Itermeration implements Enumeration {

	private Iterator it;
	
	public Itermeration(Iterator it){
		this.it = it;
	}
	@Override
	public boolean hasMoreElements() {
		return it.hasNext();
	}

	@Override
	public Object nextElement() {
		return it.next();
	}

}
