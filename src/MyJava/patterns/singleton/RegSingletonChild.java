package MyJava.patterns.singleton;

public class RegSingletonChild extends RegSingleton {
	public RegSingletonChild(){
		
	}
	
	public static RegSingletonChild getInstance(){
		return (RegSingletonChild) RegSingleton.getInstance("MyJava.patterns.singleton.RegSingletonChild");
	}
	public void abort(){
		System.out.println("this is regsingleton");
	}
}
