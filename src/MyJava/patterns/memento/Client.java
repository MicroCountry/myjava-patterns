package MyJava.patterns.memento;

public class Client {
	private static Originator o=new Originator();
	private static 	Caretaker c= new Caretaker();
	public static void main(String[] args) {
		o.setState("On");
		c.saveMemento(o.createMemento());
		o.setState("Off");
		o.restoreMemento(c.retrieveMemento());
		System.out.println(o.getState());
	}
}
