package MyJava.patterns.observer;

import java.util.Enumeration;
import java.util.Vector;

public class ConcreteSubject implements Subject {

	private Vector observers = new Vector();
	@Override
	public void attach(Observer observer) {
		observers.addElement(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.removeElement(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration enumeration = observers();
		while(enumeration.hasMoreElements()){
			((Observer)enumeration.nextElement()).update();
		}
	}

	public Enumeration observers(){
		return ((Vector)observers.clone()).elements();
	}
	
	private String state;
	public void change(String state){
		this.state = state;
		this.notifyObservers();
	}
}
