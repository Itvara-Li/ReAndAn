package com.coffee.a05;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.RuntimeErrorException;

import org.json.JSONObject;

import com.coffee.reflect.util.ReflectUtil;

public class JSONutil {
   public static JSONObject pojo2JSON(Object obj) throws Exception {
	  Class cls=obj.getClass();
	Field[] fields=cls.getDeclaredFields();
	JSONObject json=new JSONObject();
	for(Field f:fields){
		String name=f.getName();
		String getterName=ReflectUtil.getterName(name);
		Method getter=cls.getDeclaredMethod(getterName);
		Object value=getter.invoke(obj);
		if (value instanceof Date) {
			SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd");
			String dateString=sDateFormat.format(value);
			value=dateString;
		}
		if (value instanceof Timestamp) {
			SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString=sDateFormat.format(value);
			value=dateString;
		}
		if (value!=null) {
			json.put(name, value);
		}else {
			throw new Exception("null");
		}
		
	}
	return json;
}

   public static Object JSON2pojo(JSONObject json,Class pojoClass) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	   Field[] fields=pojoClass.getDeclaredFields();
	   Object pojo=null;
	   try {
		pojo=pojoClass.newInstance();
	} catch (Exception e) {
		throw new RuntimeException( pojoClass.getName()+"构造出错！");
	}
	   for (Field f:fields) {
		String name=f.getName();
		Class argType=f.getType();
		String setterName=ReflectUtil.setterName(name);
		Method setter=pojoClass.getDeclaredMethod(setterName, argType);
		
		Object argValue=null;
		if (argType.equals(int.class)||argType.equals(Integer.class)) {
			argValue=json.optInt(name, 0);
		}else if (argType.equals(long.class)||argType.equals(Long.class)) {
			argValue=json.optLong(name, 0L);
		}else if (argType.equals(String.class)) {
			argValue=json.optString(name, "");
		}else if (argType.equals(boolean.class)||argType.equals(Boolean.class)) {
			argValue=json.optBoolean(name,true);
		}else if (argType.equals(short.class)||argType.equals(Short.class)) {
			argValue=json.optInt(name, 0);
		}else if (argType.equals(byte.class)||argType.equals(Byte.class)) {
			argValue=(byte)json.optInt(name, 0);
		}if (argType.equals(double.class)||argType.equals(Double.class)) {
			argValue=json.optDouble(name, 0);
		}if (argType.equals(float.class)||argType.equals(Float.class)) {
			argValue=json.optDouble(name, 0);
			
		}
		//stu.setId(json.getInt("id"));
		//json.getString(key)
		setter.invoke(pojo, argValue);
	}
	 return pojo;  
	
}
}
