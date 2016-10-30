package MyJava.patterns.visitor;

public class Cpu extends Equipment {

	@Override
	public void accept(Visitor vis) {
		System.out.println("Cpu has been visited.");
		vis.visitCpu(this);
	}

	@Override
	public double price() {
		return 800.0;
	}

}
