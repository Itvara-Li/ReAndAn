package com.coffee.a03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test3 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls=Class.forName("com.coffee.Example.Example");
		Method[] methods=cls.getDeclaredMethods();
		Method method=getMethod(methods, "test2");
	//	System.out.println(method.toString());
		//////////////////////////////////////////////////
		Method method2=cls.getDeclaredMethod("test3", double.class,double.class);
		System.out.println(method2.toString());
		//函数调用
		Object obj=cls.newInstance();
		Method test1Method=cls.getDeclaredMethod("test1");
		test1Method.invoke(obj);
	}
 public static Method getMethod(Method[]methods,String name) {
	 for (Method m:methods) {
			if (m.getName().equals(name.trim())) {
				return m;
			}
		}
	return null;

}
}
