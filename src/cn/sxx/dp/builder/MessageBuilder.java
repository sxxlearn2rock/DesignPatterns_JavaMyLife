package cn.sxx.dp.builder;

import java.util.Date;

abstract public class MessageBuilder {
	protected Message msg = new Message();
	
	abstract public void buildToWhom();
	abstract public void buildFromWhom();
	abstract public void buildBody();
	
	public void buildSubject(){
		msg.setSubject("¿ÕÖ÷Ìâ");
	}
	
	public void buildDate(){
		msg.setDate(new Date());
	}
	
	public Message retrieveMessage(){
		return msg;
	}
}
