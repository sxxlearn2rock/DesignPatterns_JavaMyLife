package cn.sxx.dp.templatemethod;

public class CDAccount extends Account {

	@Override
	protected ACCOUNT_TYPE doCalAccountType() {
		return ACCOUNT_TYPE.CD;
	}

	@Override
	protected double doCalnterestRate() {
		return 0.06;
	}

}
