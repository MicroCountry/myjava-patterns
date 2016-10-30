package MyJava.patterns.visitor;

import java.util.Vector;

public class Composite extends Equipment {

	private Vector parts = new Vector(10);
	
	public Composite(){
		
	}
	@Override
	public void accept(Visitor vis) {
		for(int i=0 ;i<parts.size();i++){
			((Equipment)(parts.get(i))).accept(vis);
		}
	}

	@Override
	public double price() {
		double total =0;
		for(int i=0;i<parts.size();i++){
			total+=((Equipment)(parts.get(i))).price();
		}
		return total;
	}

	public void add(Equipment e){
		parts.addElement(e);
	}
}
