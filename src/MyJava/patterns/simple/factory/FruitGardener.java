package MyJava.patterns.simple.factory;

public class FruitGardener {
	public static Fruit fruitFactory(String which) throws BadFruitException{
		if(which.equalsIgnoreCase("apple")){
			new Apple();
		}else if(which.equalsIgnoreCase("grape")){
			new Grape();
		}else{
			throw new BadFruitException("no");
		}
		return null;
	}
}
