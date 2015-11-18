package cn.sxx.dp.builder;

public class Director {
	
	public Director(MessageBuilder builder) {
		this.builder = builder;
	}

	private MessageBuilder builder;

	public void constructMessage() {
		this.builder.buildSubject();
		this.builder.buildToWhom();
		this.builder.buildFromWhom();
		this.builder.buildBody();
		this.builder.buildDate();		
	}

	public void setBuilder(MessageBuilder builder) {
		this.builder = builder;
	}
}
