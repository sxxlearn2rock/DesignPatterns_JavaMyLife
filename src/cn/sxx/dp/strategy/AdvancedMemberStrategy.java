package cn.sxx.dp.strategy;

public class AdvancedMemberStrategy implements MemberStrategy{

	@Override
	public double calcPrice(double originPrice) {
		System.out.println("�߼���Ա��8��");
		return originPrice * 0.8;
	}

}
