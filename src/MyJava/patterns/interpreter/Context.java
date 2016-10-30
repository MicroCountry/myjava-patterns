package MyJava.patterns.interpreter;

import java.util.HashMap;

public class Context {
	private HashMap map = new HashMap();
	public void assign(Variable var,boolean value){
		map.put(var, value);
	}
	
	public boolean lookup(Variable var){
		Boolean value = (Boolean)map.get(var);
		if(value==null){
			throw new IllegalArgumentException();
		}
		return value.booleanValue();
	}
}
