package com.coffee.a03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class test4 {
public static void main(String[] args) {
	/**
	 * 不带返回值的函数调用
	 */
	try {
		Class cls=Class.forName("com.coffee.Example.Example");
		Object obj=cls.newInstance();
		Class[] parameterTypes={Integer.class,Integer.class};
		Method testMethod=cls.getDeclaredMethod("test2", parameterTypes);
		Object[] args1={10,30};
		testMethod.invoke(obj, args1);
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
