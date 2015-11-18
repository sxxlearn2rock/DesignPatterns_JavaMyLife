package cn.sxx.dp.decorator;

public class Fish extends Change {

	public Fish(TheGreatSage sage) {
		super(sage);
	}	

	@Override
	public void move() {
		System.out.println("Fish move");
	}
}
