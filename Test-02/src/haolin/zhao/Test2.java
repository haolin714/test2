package haolin.zhao;

import java.lang.reflect.Method;

public class Test2 {
	
	public static void main(String[] args) throws Exception, IllegalAccessException {
		A a = new A();
		Class<? extends A> class1 = a.getClass();
		A newInstance = class1.newInstance();
		Method[] methods = class1.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(Zhujie.class)) {
				Zhujie annotation = method.getAnnotation(Zhujie.class);
				int id = annotation.id();
				String value = annotation.title()!=null?annotation.title():annotation.value();
				System.out.println("注解id："+id+";  value: "+value);
				method.invoke(newInstance);
				System.out.println("---------------------------");
			}
		}
	}
}
