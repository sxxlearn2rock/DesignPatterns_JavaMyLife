package cn.sxx.dp.templatemethod;

public class Client {
	public static void main(String[] args) {
		Account a1 = new MoneuMarketAccount();
		a1.calculateInterest();
		System.out.println();
		
		Account a2 = new CDAccount();
		a2.calculateInterest();
	}
	
	
}
