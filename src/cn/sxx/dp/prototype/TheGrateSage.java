package cn.sxx.dp.prototype;

public class TheGrateSage {
	private Monkey monkey = new Monkey();
	
	public void change(){
		Monkey copyMonkey = (Monkey)monkey.clone();
		System.out.println("大圣本尊的生日是：" + monkey.getBirthday());
        System.out.println("克隆的大圣的生日是：" + monkey.getBirthday());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " +
        			(monkey.getGoldStuff() == copyMonkey.getGoldStuff()));
    }
	
	public static void main(String[] args) {
		TheGrateSage sun = new TheGrateSage();
		sun.change();
	}
	
}
