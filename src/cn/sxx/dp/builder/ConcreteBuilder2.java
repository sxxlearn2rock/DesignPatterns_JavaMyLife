package cn.sxx.dp.builder;

public class ConcreteBuilder2 extends MessageBuilder {

	@Override
	public void buildToWhom() {
		msg.setToWhom("AAA");
	}

	@Override
	public void buildFromWhom() {
		msg.setFromWhom("BBB");
	}

	@Override
	public void buildBody() {
		msg.setBody("Thank YOU!");
	}
	
	@Override
	public void buildSubject() {
		msg.setSubject("´ð¸´");
	}

}
