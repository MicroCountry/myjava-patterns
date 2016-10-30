package MyJava.patterns.interpreter;

public class Or extends Expression {

	private Expression	left,right;
	
	public Or(Expression left,Expression right){
		this.left = left;
		this.right = right;
	}
	@Override
	public boolean equals(Object o) {
		if(o!=null && o instanceof Or){
			return this.left.equals(((Or)o).left)&&this.right.equals(((Or)o).right);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (this.toString()).hashCode();
	}

	@Override
	public String toString() {
		return "("+left.toString()+" OR "+right.toString()+")";
	}

	@Override
	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return left.interpret(ctx)||right.interpret(ctx);
	}

}
