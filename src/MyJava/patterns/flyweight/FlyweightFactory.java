package MyJava.patterns.flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FlyweightFactory {
	private HashMap files = new HashMap();
	private Flyweight lnkFlyweight;
	public FlyweightFactory(){}
	public Flyweight factory(Character state){
		if(files.containsKey(state)){
			return (Flyweight)files.get(state);
		}else{
			Flyweight fly = new ConcreteFlyweight(state);
			files.put(state, fly);
			return fly;
		}
	}
	
	public Flyweight factory(String compositeState){
		ConcreteCompositeFlyweight compositeFly = new 	ConcreteCompositeFlyweight();
		int length = compositeState.length();
		Character state =null;
		for(int i=0;i<length;i++){
			state = new Character(compositeState.charAt(i));
			System.out.println("factory("+state+")");
			compositeFly.add(state, this.factory(state));
		}
		return compositeFly;
	}
	public void checkFlyweight(){
		Flyweight fly;
		int i=0;
		System.out.println("\n=====checkFlyweight=====");
		for(Iterator it =files.entrySet().iterator();it.hasNext();){
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("Item "+(++i)+":"+e.getKey());
		}
		System.out.println("\n=====checkFlyweight=====");
	}
}
