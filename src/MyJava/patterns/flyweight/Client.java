package MyJava.patterns.flyweight;

public class Client {
	private static Order[] flavors =new Flavor[20];
	private static int ordersMade =0;
	private static FlavorFactory flavorFactory;
	private static void takeOrders(String aFlavor){
		flavors[ordersMade++] = flavorFactory.getOrder(aFlavor);
	}
	public static void main(String[] args) {
		flavorFactory =new FlavorFactory();
		takeOrders("Black Coffee");
		takeOrders("Capucino");
		takeOrders("Espresso");
		takeOrders("Espresso");
		takeOrders("Capucino");
		for(int i=0;i<ordersMade;i++){
			flavors[i].serve();
		}
		System.out.println("\nTotal teaFlavor objects made:"+flavorFactory.getTotalFlavorsMade());
	}
}
