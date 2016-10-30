package MyJava.patterns.visitor;

public abstract class Equipment {
	public abstract void accept(Visitor vis);
	public abstract double price();
}
