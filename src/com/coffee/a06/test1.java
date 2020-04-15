package com.coffee.a06;

import java.lang.reflect.Field;

import com.coffee.annotation.FieldInfo;
/**
 * 注解与反射
 * @author coffeeliu
 *
 */
public class test1 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class cls=Class.forName("com.coffee.entity.Student");
		Field field=cls.getDeclaredField("birthday");
		//判断是否定义了注解
		if (field.isAnnotationPresent(FieldInfo.class)) {
			FieldInfo an=field.getAnnotation(FieldInfo.class);
			String string=an.format();
			System.out.println(string );
		}
		

	}

}
