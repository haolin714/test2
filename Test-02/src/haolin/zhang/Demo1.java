package haolin.zhang;

public class Demo1 {
	private int acc = 12;
	public void a() {
		System.out.println("公开方法a");
	};
	private void b() {
		System.out.println("私有方法b");
	};
	public Demo1() {}
	public Demo1(int acc) {
		
	}
	public int getAcc() {
		return acc;
	}
	public void setAcc(int acc) {
		this.acc = acc;
	}
	
}
