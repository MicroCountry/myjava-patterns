package MyJava.patterns.strategy;

public class NoDiscountStrategy extends DiscountStrategy {

	private Double price=0.0;
	private int copies =0;
	public NoDiscountStrategy(Double price, int copies) {
		this.price = price;
		this.copies = copies;
	}
	@Override
	public Double calculateDiscount() {
		return 0.0;
	}

}
