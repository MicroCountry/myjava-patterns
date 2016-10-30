package MyJava.patterns.visitor;

public class MainBoard extends Equipment {

	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		System.out.println("MainBoard has been visited.");
		vis.visitMainBoard(this);
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 100.0;
	}

}
