package MyJava.patterns.iterator;

public class PurchaseOfCopB extends Purchase {

	@Override
	public Iterator createIterator() {
		return new BackwardIterator(this);
	} 

}
