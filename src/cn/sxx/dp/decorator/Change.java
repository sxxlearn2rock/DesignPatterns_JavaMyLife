package cn.sxx.dp.decorator;

public class Change implements TheGreatSage{
	
	private TheGreatSage sage;
	
	public Change(TheGreatSage sage) {
		this.sage = sage;
	}

	@Override
	public void move() {
		sage.move();
	}
	
}
