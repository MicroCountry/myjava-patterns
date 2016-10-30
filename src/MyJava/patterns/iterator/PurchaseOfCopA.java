package MyJava.patterns.iterator;

public class PurchaseOfCopA extends Purchase {
	
	public PurchaseOfCopA(){}
	@Override
	public Iterator createIterator() {
		return new ForwardIterator(this);
	}

}
