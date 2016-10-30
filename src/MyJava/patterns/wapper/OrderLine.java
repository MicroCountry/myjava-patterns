package MyJava.patterns.wapper;

import java.text.NumberFormat;

public class OrderLine {
	private String itemName;
	private int units;
	private double unitPrice;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public void printLine(){
		System.out.println(itemName+"\t"+units+"\t"+formatCurrency(unitPrice)+"\t\t"+formatCurrency(getSubtotal()));
	}
	
	public Double  getSubtotal(){
		return unitPrice*units;
	}
	
	public String formatCurrency(Double amnt){
		return NumberFormat.getCurrencyInstance().format(amnt);
	}
}
