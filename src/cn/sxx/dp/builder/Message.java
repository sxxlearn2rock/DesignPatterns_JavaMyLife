package cn.sxx.dp.builder;

import java.util.Date;

public class Message {
	private String toWhom;
	private String fromWhom;
	private String subject;
	private String body;
	private Date date;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("New message! Subject: ").append(subject).append(".\n");		
		sb.append("Dear ").append(toWhom).append(": \n\t").append(body).append("\n\t\t\t");
		sb.append(fromWhom).append("  at  ").append(date);	
		
		return sb.toString();
	}
	
	public String getToWhom() {
		return toWhom;
	}
	public void setToWhom(String toWhom) {
		this.toWhom = toWhom;
	}
	public String getFromWhom() {
		return fromWhom;
	}
	public void setFromWhom(String fromWhom) {
		this.fromWhom = fromWhom;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
