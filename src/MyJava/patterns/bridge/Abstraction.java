package MyJava.patterns.bridge;

public class Abstraction {
	protected Implementor imp;
	
	public void operation(){
		imp.operationImp();
	}
}
