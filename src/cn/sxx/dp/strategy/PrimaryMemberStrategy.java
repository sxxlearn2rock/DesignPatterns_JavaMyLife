package cn.sxx.dp.strategy;

public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double originPrice) {
		System.out.println("������Աû���ۿ�");
		return originPrice;
	}

}
