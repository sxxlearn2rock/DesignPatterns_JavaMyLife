package cn.sxx.dp.decorator;

public class Bird extends Change{

	public Bird(TheGreatSage sage) {
		super(sage);
	}

	@Override
	public void move() {
		System.out.println("Bird move");
	}
}
