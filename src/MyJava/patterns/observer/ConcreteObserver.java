package MyJava.patterns.observer;

public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("I am notfied");
	}

}
