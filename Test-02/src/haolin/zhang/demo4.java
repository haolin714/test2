package haolin.zhang;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class demo4 {
	public static void main(String[] args) throws Exception, Exception {
		Demo1 demo1 = new Demo1();
		Class<? extends Demo1> class1 = demo1.getClass();
		Field declaredField = class1.getDeclaredField("acc");
		declaredField.setAccessible(true);
		declaredField.set(demo1, 160);
		System.out.println(demo1.getAcc());
		
		int r = (int) declaredField.get(demo1);
		System.out.println(r);
		
		Method method = class1.getMethod("setAcc", int.class);
		Method method2 = class1.getMethod("getAcc");
		method.invoke(demo1, 900);
		System.out.println("反射方法赋值为："+demo1.getAcc());
		
		int invoke = (int) method2.invoke(demo1);
		System.out.println("反射取值为："+invoke);
		
	}
}
