package MyJava.patterns.factory.method;

import MyJava.patterns.simple.factory.Apple;
import MyJava.patterns.simple.factory.Fruit;

public class AppleGardender implements FruitGardener {

	@Override
	public Fruit factory() {
		return new Apple();
	}

}
