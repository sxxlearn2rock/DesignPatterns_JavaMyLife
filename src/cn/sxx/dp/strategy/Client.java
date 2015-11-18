package cn.sxx.dp.strategy;

public class Client {
	public static void main(String[] args) {
		MemberStrategy strategy = new AdvancedMemberStrategy();
		
		Price price = new Price(strategy);
		
		double quoto  = price.quote(300);
		System.out.println(quoto);
	}
}
