package MyJava.patterns.wapper;

import java.util.Date;

public class Client {
	private static Order order;
	public static void main(String[] args) {
		order = new SalesOrder();
		order.setSalesDate(new Date());
		order.setCustomerName("XYZ Repair Shop");
		OrderLine line1 = new OrderLine();
		line1.setItemName("FireWheel Tire");
		line1.setUnitPrice(154.23);
		line1.setUnits(4);
		order.addItem(line1);
		OrderLine line2 = new OrderLine();
		line2.setItemName("Front Fender");
		line2.setUnitPrice(300.45);
		line2.setUnits(1);
		order.addItem(line2);
		OrderLine line3 = new OrderLine();
		line3.setItemName("Others Tire");
		line3.setUnitPrice(10.45);
		line3.setUnits(10);
		order.addItem(line3);
		order = new HeaderWapper(new FooterWapper(order));
		order.print();
	}
}
