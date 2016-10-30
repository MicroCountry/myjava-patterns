package MyJava.patterns.strategy;

public class PercentageStrategy extends DiscountStrategy {

	private Double percent;
	private Double price=0.0;
	private int copies =0;
	
	public PercentageStrategy(Double price,int copies){
		this.price = price;
		this.copies = copies;
	}
	
	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	@Override
	public Double calculateDiscount() {
		return percent*price*copies;
	}

}
