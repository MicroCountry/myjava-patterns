package MyJava.patterns.visitor;

public class Case extends Equipment {

	@Override
	public void accept(Visitor vis) {
		System.out.println("Case has been visited.");
		vis.visitCase(this);
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 30.0;
	}

}
