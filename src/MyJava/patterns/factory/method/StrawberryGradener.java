package MyJava.patterns.factory.method;

import MyJava.patterns.simple.factory.Fruit;
import MyJava.patterns.simple.factory.StrawBerry;

public class StrawberryGradener implements FruitGardener {

	@Override
	public Fruit factory() {
		return new StrawBerry();
	}

}
