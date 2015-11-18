package cn.sxx.dp.strategy;

public class AdvancedMemberStrategy implements MemberStrategy{

	@Override
	public double calcPrice(double originPrice) {
		System.out.println("高级会员打8折");
		return originPrice * 0.8;
	}

}
