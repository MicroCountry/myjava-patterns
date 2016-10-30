package MyJava.patterns.strategy;

public class FlatRateStrategy extends DiscountStrategy {

	private Double price=0.0;
	private int copies=0;
	private Double amount;
	
	public FlatRateStrategy(Double price,int copies){
		this.price = price;
		this.copies = copies;
	}
	
	
	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	@Override
	public Double calculateDiscount() {
		// TODO Auto-generated method stub
		return copies*amount;
	}

}
