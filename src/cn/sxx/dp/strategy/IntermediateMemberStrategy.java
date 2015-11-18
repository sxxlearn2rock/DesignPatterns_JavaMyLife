package cn.sxx.dp.strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double originPrice) {
		System.out.println("中级会员打9折");
		return originPrice * 0.9;
	}

}
