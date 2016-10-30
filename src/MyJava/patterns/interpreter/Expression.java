package MyJava.patterns.interpreter;

public abstract class Expression {
	public abstract boolean interpret(Context ctx);
	public abstract boolean equals(Object o);
	public abstract int hashCode();
	public abstract String toString();
}
