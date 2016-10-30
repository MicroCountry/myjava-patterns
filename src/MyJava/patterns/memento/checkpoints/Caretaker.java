package MyJava.patterns.memento.checkpoints;

import java.util.Vector;

public class Caretaker {
	private Originator o;
	private Vector mementos = new Vector();
	private int current;
	
	public Caretaker(Originator o){
		this.o =o;
		this.current =0 ;
	}
	
	public int createMemento(){
		Memento memento = o.createMemento();
		mementos.addElement(memento);
		return current++;
	}
	
	public void restoreMemento(int index){
		Memento memento =(Memento) mementos.elementAt(index);
		o.restoreMemento(memento);
	}
	
	public void removeMemento(int index){
		mementos.removeElementAt(index);
	}
}
