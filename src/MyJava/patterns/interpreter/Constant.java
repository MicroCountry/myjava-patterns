package MyJava.patterns.interpreter;

public class Constant extends Expression {

	private boolean value;
	
	public Constant(boolean value){
		this.value = value;
	}
	@Override
	public boolean equals(Object o) {
		if(o!=null&& o instanceof Constant){
			return this.value = ((Constant)o).value;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (this.toString()).hashCode();
	}

	@Override
	public String toString() {
		return new Boolean(value).toString();
	}

	@Override
	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return value;
	}

}
