package cn.sxx.dp.builder;

public class Client {
	
	public static void main(String[] args) {
		MessageBuilder builder1= new ConcreteBuilder1();
		MessageBuilder builder2 = new ConcreteBuilder2();
		
		Director director = new Director(builder1);
		director.constructMessage();
		Message msg1 = builder1.retrieveMessage();
		System.out.println(msg1);
		System.out.println();
		director.setBuilder(builder2);
		director.constructMessage();
		Message msg2 = builder2.retrieveMessage();
		System.out.println(msg2);
	}

}
