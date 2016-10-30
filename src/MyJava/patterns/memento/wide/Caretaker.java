package MyJava.patterns.memento.wide;

public class Caretaker {
	private MementoIF memento;
	public MementoIF retrieveMemento(){
		return this.memento;
	}
	public void saveMemento(MementoIF memento){
		this.memento = memento;
	}
}
