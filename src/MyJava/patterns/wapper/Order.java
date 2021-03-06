package MyJava.patterns.wapper;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Vector;

public abstract class Order {
	private OrderLine lnkOrderLine;
	protected String customerName;
	protected Date salesDate;
	protected Vector items = new Vector(10);
	public void print(){
		System.out.println("size:"+items.size());
		for(int	i=0;i<items.size();i++){
			OrderLine item = (OrderLine)items.get(i);
			item.printLine();
		}
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}
	public void addItem(OrderLine item){
		items.add(item);
	}
	public void removeItem(OrderLine item){
		items.remove(item);
	}
	public double getGrandTotal(){
		double  amnt = 0.0D;
		for(int i=0;i<items.size();i++){
			OrderLine item = (OrderLine) items.get(i);
			amnt+=item.getSubtotal();
		}
		return amnt;
	}
	
	protected String formatCurrency(double amnt){
		return NumberFormat.getCurrencyInstance().format(amnt);
	}
}
