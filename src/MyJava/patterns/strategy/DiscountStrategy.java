package MyJava.patterns.strategy;

public abstract class DiscountStrategy {
	private Double price=0.0;
	private int copies =0;
	public abstract Double calculateDiscount();
	public DiscountStrategy(Double price,int copies){
		this.price = price;
		this.copies = copies;
	}
	public DiscountStrategy(){}
}
