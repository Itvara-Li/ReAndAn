package com.coffee.a03;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class test1 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class cls=Class.forName("com.coffee.entity.Student");
		Method[] methods=cls.getDeclaredMethods();
		for(Method m:methods){
			String name=m.getName();//方法名
			Type returnType=m.getGenericReturnType();//返回值类型
			System.out.println(name+"|"+returnType.toString());
		}
	}

}
