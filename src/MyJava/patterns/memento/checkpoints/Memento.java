package MyJava.patterns.memento.checkpoints;

import java.util.Vector;

public class Memento {
	private Vector states;
	private int index;
	public Memento(Vector states,int index){
		this.states = states;
		this.index = index;
	}
	
	Vector getStates(){
		return this.states;
	}
	
	int getIndex(){
		return this.index;
	}
}
