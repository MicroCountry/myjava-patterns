package MyJava.patterns.flyweight;

public class TestFlyweight {
	public static void main(String[] args) {
		/*FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory(new Character('a'));
		fly.operation("First Call");
		fly = factory.factory(new Character('b'));
		fly.operation("Second Call");
		fly = factory.factory(new Character('a'));
		fly.operation("Third Call");
		factory.checkFlyweight();*/
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory("abc");
		fly.operation("Composite Call");
		factory.checkFlyweight();
	}
}
