package MyJava.patterns.flyweight;

public class ConcreteFlyweight extends Flyweight {
	
	private Character intrinsicState =null;
	
	public ConcreteFlyweight(Character intrinsicState){
		this.intrinsicState = intrinsicState;
	}
	@Override
	public void operation(String state) {
		System.out.println("\nIntrinsic State="+intrinsicState+",Extrinsic state="+state);
	}

}
