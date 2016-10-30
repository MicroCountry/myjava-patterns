package MyJava.patterns.flyweight;

public class FlavorFactory {
	private Order[] orders = new Flavor[10];
	
	private int ordersMade = 0;
	private int totalFlavors = 0;
	public Order getOrder(String flavorToGet){
		if(ordersMade>0){
			for(int i=0;i<ordersMade;i++){
				if(flavorToGet.equals(orders[i].getFlavor())){
					return orders[i];
				}
			}
		}
		orders[ordersMade] = new Flavor(flavorToGet);
		totalFlavors++;
		return orders[ordersMade++];
	}
	public int getTotalFlavorsMade(){
		return totalFlavors;
	}
}
