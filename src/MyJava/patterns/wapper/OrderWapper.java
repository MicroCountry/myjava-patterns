package MyJava.patterns.wapper;

public class OrderWapper extends Order {
	protected Order order;
	public 	OrderWapper(Order order){
		this.order = order;
		this.setSalesDate(order.getSalesDate());
		this.setCustomerName(order.getCustomerName());
	}
	public void print(){
		super.print();
	}
}
