package MyJava.patterns.strategy;

public class Context {
	private Strategy strategy;
		
	public void contextInterface(){
		strategy.strategyInterface();
	}
}
