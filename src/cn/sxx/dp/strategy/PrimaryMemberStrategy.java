package cn.sxx.dp.strategy;

public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double originPrice) {
		System.out.println("初级会员没有折扣");
		return originPrice;
	}

}
