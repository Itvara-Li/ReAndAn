package com.coffee.a03;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
//import com.coffee.Example.Example;;
public class test2 {
public static void main(String[] args) throws ClassNotFoundException {
	Class cls=Class.forName("com.coffee.Example.Example");
	//Example example=new Example();
	//Class cls=example.getClass();
	Method[] methods=cls.getDeclaredMethods();
	for(Method m:methods){
		String name=m.getName();//方法名
		Class returnType=m.getReturnType();//返回值类型
	    Class[] paramTypes=	m.getParameterTypes();
	    System.out.println(returnType.getSimpleName()+"|"+name+"(");
	    for (int i = 0; i < paramTypes.length; i++) {
			Class param=paramTypes[i];
			System.out.println(param.getSimpleName());
			if (i<paramTypes.length-1) {
				System.out.println(",");
			}
			System.out.println(")");
		}
	}
}
}
