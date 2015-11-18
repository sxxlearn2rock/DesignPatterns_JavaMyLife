package cn.sxx.dp.prototype;

import java.util.Date;

public class Monkey implements Cloneable {
	private int height;
	private int weight;
	private Date birthday;
	private GoldStuff goldStuff;
	
	public Monkey() {
		birthday = new Date();
		goldStuff = new GoldStuff();
	}
	
	@Override
	protected Object clone() {
		Monkey temp = null;
		try {
			temp = (Monkey) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}finally {
			return temp;
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public GoldStuff getGoldStuff() {
		return goldStuff;
	}

	public void setGoldStuff(GoldStuff goldStuff) {
		this.goldStuff = goldStuff;
	}
}
