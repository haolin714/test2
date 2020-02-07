package haolin.zhang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class demo2 {
	public static void main(String[] args) {
		//Class<Demo1> d1 = Demo1.class;
		//System.out.println(d1);
		try {
			Class<?> forName = Class.forName("haolin.zhang.Demo1");
			//System.out.println(forName.getName());
			//System.out.println(forName.getPackage());
			//System.out.println(forName.getSimpleName());
			Field[] declaredFields = forName.getDeclaredFields();
			for (Field field : declaredFields) {
				String name = field.getType().getName();
				String name2 = field.getName();
				System.out.println(name+"    "+name2);
			}
			
			Constructor<?>[] declaredConstructors = forName.getDeclaredConstructors();
			for (Constructor<?> constructor : declaredConstructors) {
				Class<?>[] parameterTypes = constructor.getParameterTypes();
				String simpleName = forName.getSimpleName();
				System.out.println(simpleName+"("+Arrays.toString(parameterTypes)+")");
			}
			
			Method[] declaredMethods = forName.getDeclaredMethods();
			for (Method method : declaredMethods) {
				String name = method.getName();
				Class<?>[] parameterTypes = method.getParameterTypes();
				System.out.println(name+"("+Arrays.toString(parameterTypes)+")");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
