package MyJava.patterns.interpreter;

public class Not extends Expression {

	private Expression	exp;
	
	public Not(Expression exp){
		this.exp = exp;
	}
	@Override
	public boolean equals(Object o) {
		if(o!=null && o instanceof Not){
			return this.exp.equals(((Not)o).exp);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (this.toString()).hashCode();
	}

	@Override
	public String toString() {
		return "( Not "+exp.toString()+")";
	}

	@Override
	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return !exp.interpret(ctx);
	}

}
