package MyJava.patterns.wapper;

public class FooterWapper extends OrderWapper {

	public FooterWapper(Order order) {
		super(order);
	}
	
	public void print(){
		System.out.println("******print footerWapper 111");
		super.order.print();
		System.out.println("******print footerWapper 222");
		this.printFooter();
		System.out.println("******print footerWapper 333");
	}
	
	private void printFooter(){
		System.out.println("============================");
		System.out.println("Total\t\t\t"+formatCurrency(super.order.getGrandTotal()));
	}

}
