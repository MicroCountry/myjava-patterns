package MyJava.patterns.wapper;

public class HeaderWapper extends OrderWapper {

	public HeaderWapper(Order order) {
		super(order);
	}
	public void print(){
		System.out.println("****headerWapper 111");
		this.printHeader();
		System.out.println("****headerWapper 222");
		super.order.print();
		System.out.println("****headerWapper 333");
	}
	private void printHeader(){
		System.out.println("\t***\tI N V O I C E\t***");
		System.out.println("X Y Z Incorporated\nDate of Sale:");
		System.out.println(order.getSalesDate());
		System.out.println("=================================");
		System.out.println("Item\t\tUnits\tUnit Price\tSubtoal");
	}
}
