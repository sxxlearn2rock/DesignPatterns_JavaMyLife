package cn.sxx.dp.strategy;

public class Price {
	private MemberStrategy strategy;
	
	public Price(MemberStrategy strategy) {
		this.strategy = strategy;
	}
	
	public double quote(double originPrice){
		return strategy.calcPrice(originPrice);
	}
}
