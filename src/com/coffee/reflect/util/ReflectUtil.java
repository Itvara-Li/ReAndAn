package com.coffee.reflect.util;

public class ReflectUtil {

	public static String getterName(String field) {
		//name->gerName
		char fc=Character.toUpperCase(field.charAt(0));
		StringBuffer stringBuffer=new StringBuffer("get"+field);
		stringBuffer.setCharAt(3, fc);
		return stringBuffer.toString();
	}
	public static String setterName(String field) {
		//name->gerName
		char fc=Character.toUpperCase(field.charAt(0));
		StringBuffer stringBuffer=new StringBuffer("set"+field);
		stringBuffer.setCharAt(3, fc);
		return stringBuffer.toString();
	}
	
}
