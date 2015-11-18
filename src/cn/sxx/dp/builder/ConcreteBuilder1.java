package cn.sxx.dp.builder;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class ConcreteBuilder1 extends MessageBuilder {

	@Override
	public void buildToWhom() {
		msg.setToWhom("BBB");
	}

	@Override
	public void buildFromWhom() {
		msg.setFromWhom("AAA");
	}

	@Override
	public void buildBody() {
		msg.setBody("Happy birthday!");
	}

	@Override
	public void buildDate() {
		Calendar calendar = Calendar.getInstance();	
		calendar.set(2015, 11, 2, 0, 0, 0);
		Date date = calendar.getTime();
		msg.setDate(date);
	}
}
