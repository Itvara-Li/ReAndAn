package com.coffee.a03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * 带返回值的函数调用
 * @author coffeeliu
 *
 */
public class test5 {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	Class cls=Class.forName("com.coffee.Example.Example");
	Object obj=cls.newInstance();
	Class[] parameterTypes={double.class,double.class};
	Method testMethod=cls.getDeclaredMethod("test5", parameterTypes);
	Object[] args1={10.1,30.5};
	Object result= testMethod.invoke(obj, args1);
	//判断实例是否是某一个类的或者是其之类方法1
//	if(result instanceof Double)
//	{
//		System.out.println(result);}	
//	}
	//2
    if(Double.class.isInstance(result)){}
    //3
    Class c=result.getClass();
    if(c.equals(Double.class)){}
}
}
