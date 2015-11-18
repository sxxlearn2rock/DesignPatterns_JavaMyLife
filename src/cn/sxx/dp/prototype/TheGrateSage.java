package cn.sxx.dp.prototype;

public class TheGrateSage {
	private Monkey monkey = new Monkey();
	
	public void change(){
		Monkey copyMonkey = (Monkey)monkey.clone();
		System.out.println("��ʥ����������ǣ�" + monkey.getBirthday());
        System.out.println("��¡�Ĵ�ʥ�������ǣ�" + monkey.getBirthday());
        System.out.println("��ʥ�������¡�Ĵ�ʥ�Ƿ�Ϊͬһ������ " + (monkey == copyMonkey));
        System.out.println("��ʥ������еĽ𹿰� �� ��¡�Ĵ�ʥ���еĽ𹿰��Ƿ�Ϊͬһ������ " +
        			(monkey.getGoldStuff() == copyMonkey.getGoldStuff()));
    }
	
	public static void main(String[] args) {
		TheGrateSage sun = new TheGrateSage();
		sun.change();
	}
	
}
