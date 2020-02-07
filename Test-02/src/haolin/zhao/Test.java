package haolin.zhao;

import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws Exception, Exception {
		A a = new A();
		Class<? extends A> class1 = a.getClass();
		Object obj = class1.newInstance();//通过反射创建新示例
		Method[] methods = class1.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(Zhujie.class)) {//判断方法上是否有zhujie这个注解
				Zhujie zj = method.getAnnotation(Zhujie.class);//获取注解上的数据
				System.out.println("id:"+zj.id());
				System.out.println("title:"+(zj.title().length()==0?zj.value():zj.title()));
				method.invoke(obj);//反射执行方法
				System.out.println("------------------------");
			}
		}
	}
}
