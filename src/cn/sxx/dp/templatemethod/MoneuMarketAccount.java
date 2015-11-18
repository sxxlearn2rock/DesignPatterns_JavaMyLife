package cn.sxx.dp.templatemethod;

public class MoneuMarketAccount extends Account{

	@Override
	protected ACCOUNT_TYPE doCalAccountType() {		
		return ACCOUNT_TYPE.MM;
	}

	@Override
	protected double doCalnterestRate() {
		return 0.045;
	}

}
