package cn.sxx.dp.strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double originPrice) {
		System.out.println("�м���Ա��9��");
		return originPrice * 0.9;
	}

}
