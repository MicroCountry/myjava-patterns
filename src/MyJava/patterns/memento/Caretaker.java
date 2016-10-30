package MyJava.patterns.memento;

public class Caretaker {
	private Memento memento;
	public Memento 	retrieveMemento(){
		return this.memento;
	}
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
}
