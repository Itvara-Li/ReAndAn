package com.coffee.a02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public class test1 {
public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
	 Class cls=Class.forName("com.coffee.entity.Student");
	 Field[] fields=cls.getDeclaredFields();
	 for (Field i:fields) {
		String name=i.getName();//属性名
		Type type=i.getGenericType();//类型
		int mod=i.getModifiers();
		String result="";
		if (Modifier.isPublic(mod)) {
			result="public";
		}else if (Modifier.isPrivate(mod)) {
			result="private";
		}
		System.out.println(name+"|"+type.toString()+"|"+result);
	}
	 ////////////////////////
	 Field phoneField=cls.getDeclaredField("phone");
	System.out.println(phoneField.getName());
}
}
