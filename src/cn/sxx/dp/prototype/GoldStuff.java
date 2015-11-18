package cn.sxx.dp.prototype;

public class GoldStuff {
	private float height = 100.f;
	private float diameter = 10.f;
	
	public void grow(){
		height *= 2;
		diameter *= 2;
	}
	
	public void shrink(){
		height /= 2;
		diameter /= 2;
	}
	
}
