package cn.sxx.dp.templatemethod;

public abstract class Account {
	public final double calculateInterest(){
		double rate = doCalnterestRate();
		ACCOUNT_TYPE type = doCalAccountType();
		double amount = rate * calAmount();
	//	System.out.printf("%s ���͵���ϢΪ��%d", type, amount);
		System.out.println(type + " ���͵���ϢΪ��" + amount);
		return amount;
	}
	
	protected abstract ACCOUNT_TYPE doCalAccountType();
	protected abstract double doCalnterestRate();
	
	private double calAmount(){
		return 7243D;
	}
}

enum ACCOUNT_TYPE{
	MM,CD;
	
	private ACCOUNT_TYPE() {
		// TODO Auto-generated constructor stub
	}
	
}
