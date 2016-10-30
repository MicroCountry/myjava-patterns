package MyJava.patterns.visitor;

public class HardDisk extends Equipment {
	
	@Override
	public void accept(Visitor vis) {
		System.out.println("HardDist has been visited.");
		vis.visitHardDisk(this);
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 200.0;
	}

}
