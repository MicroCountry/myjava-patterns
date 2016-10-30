package MyJava.patterns.iterator;

public class ConcreteAggregate extends Aggregate {
	private Object[] obj ={"hose","dog","mose","monkey"};
	public Iterator createIterator(){
		return new ConcreteIterator(this);
	}
	
	public Object getElement(int index){
		if(index<obj.length){
			return obj[index];
		}else{
			return null;
		}
	}
	
	public int size(){
		return obj.length;
	}
}
