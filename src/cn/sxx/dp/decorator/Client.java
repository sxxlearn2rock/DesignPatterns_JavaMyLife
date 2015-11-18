package cn.sxx.dp.decorator;

public class Client {

	public static void main(String[] args) {
		TheGreatSage sage = new Mokey();
		TheGreatSage bird = new Bird(sage);
		TheGreatSage fish  = new Fish(bird);
		fish.move();
	}

}
