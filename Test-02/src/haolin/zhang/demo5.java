package haolin.zhang;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class demo5 {
	public static void main(String[] args) throws Exception {
		/*
		 * Demo1 demo1 = new Demo1(); Class<? extends Demo1> class1 = demo1.getClass();
		 * Field dField = class1.getDeclaredField("acc"); dField.setAccessible(true);
		 * dField.set(demo1, 123); System.out.println(demo1.getAcc());
		 * 
		 * int d = (int) dField.get(demo1); System.out.println(d);
		 * 
		 * Method set = class1.getMethod("setAcc", int.class); Method get =
		 * class1.getMethod("getAcc"); set.invoke(demo1, 144);
		 * System.out.println(demo1.getAcc());
		 * 
		 * int i = (int) get.invoke(demo1); System.out.println(i);
		 */
		
		Demo1 demo1 = new Demo1();
		Class<? extends Demo1> class1 = demo1.getClass();
		Field field = class1.getDeclaredField("acc");
		field.setAccessible(true);
		field.set(demo1, 100);
		System.out.println(demo1.getAcc());
		
		int object = (int) field.get(demo1);
		System.out.println(object);
		
		Method set = class1.getMethod("setAcc", int.class);
		Method get = class1.getMethod("getAcc");
		set.invoke(demo1, 2000);
		System.out.println("反射调用方法赋值为："+demo1.getAcc());
		int invoke = (int) get.invoke(demo1);
		System.out.println("反射调用方法取值为："+invoke);
	}
}
