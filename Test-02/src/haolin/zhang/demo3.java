package haolin.zhang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class demo3 {
	public static void main(String[] args) throws Exception {
		Demo1 demo1 = new Demo1();
		Class<Demo1> class1 = (Class<Demo1>) demo1.getClass();
		//反射赋值
		Field declaredField = class1.getDeclaredField("acc");
		declaredField.setAccessible(true);
		declaredField.set(demo1, 190);
		System.out.println(demo1.getAcc());
		
		//反射取值
		int ac = (int) declaredField.get(demo1);
		System.out.println(ac);
		
		//反射调用成员方法
		Method method = class1.getMethod("setAcc", int.class);
		Method method2 = class1.getMethod("getAcc");
		int r = (int) method2.invoke(demo1);
		System.out.println(r);
		method.invoke(demo1,13);
		System.out.println(demo1.getAcc());
	}
}
