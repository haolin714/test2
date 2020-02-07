package haolin.zhao;

public class A {
	@Zhujie(id = 1,title = "测试a")
	public void a() {
		System.out.println("这是a方法");
	}
	
	@Zhujie(id = 3)
	public void b() {
		System.out.println("这是b方法");
	}
	
	@Zhujie("测试c")
	public void c() {
		System.out.println("这是c方法");
	}
}

