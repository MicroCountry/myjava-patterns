package MyJava.patterns.interpreter;

public class And extends Expression {

	private Expression	left,right;
	
	public And(Expression left,Expression right){
		this.left = left;
		this.right = right;
	}
	@Override
	public boolean equals(Object o) {
		if(o!=null && o instanceof And){
			return this.left.equals(((And)o).left)&&this.right.equals(((And)o).right);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (this.toString()).hashCode();
	}

	@Override
	public String toString() {
		return "("+left.toString()+" AND "+right.toString()+")";
	}

	@Override
	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return left.interpret(ctx)&&right.interpret(ctx);
	}

}
