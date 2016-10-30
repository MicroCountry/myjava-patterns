package MyJava.patterns.observer;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject sub = new ConcreteSubject();
		Observer obs = new ConcreteObserver();
		sub.attach(obs);
		sub.change("red");
	}
}
