package MyJava.patterns.iterator;

public class BackwardIterator implements Iterator {
	private int state;
	private Purchase obj;
	public BackwardIterator(Purchase obj){
		this.obj = obj;
	}
	@Override
	public void first() {
		state = obj.count()-1;
	}

	@Override
	public void next() {
		if(!isDone()){
			state--;
		}
	}

	@Override
	public boolean isDone() {
		if(state<=0){
			return true;
		}
		return false;
	}

	@Override
	public Object currentItem() {
		return obj.currentItem(state);
	}

}
