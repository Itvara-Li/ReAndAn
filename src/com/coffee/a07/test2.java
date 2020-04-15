package com.coffee.a07;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import org.json.JSONObject;

import com.coffee.entity.Student;
import com.coffee.reflect.util.ReflectUtil;

/**
 * 反射实现sql
 * @author coffeeliu
 *
 */
public class test2 {
 public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Student stu=new Student(20200888,"liuwei",true,"138111111");
		stu.setBirthday(new Date());
       String ss=insertSQL(stu);
	    	
	     System.out.println(ss);
}
 
 public static String insertSQL(Object pojo) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 
	    Class cls=pojo.getClass();
		Field[] fields=cls.getDeclaredFields();
		int len=fields.length;
		String[] names=new String[len];
		String[] values=new String[len];
	     for (int i = 0; i < len; i++) {
			Field f=fields[i];
		String name=	f.getName();
		names[i]="`"+name+"`";
		String getterName=ReflectUtil.getterName(name);
		Method getter=cls.getDeclaredMethod(getterName);
		Object value=getter.invoke(pojo);
		if (value==null) {
			values[i]="NULL";
		}else {
			if (value instanceof Boolean) {
				value=((Boolean) value)?"1":"0";
			}
			values[i]="'"+value+"'";
		}
		}	
	     String tableName=" 表名";
	     String sql="insert into"+tableName+" (";
	     for (int i = 0; i < len; i++) {
			sql+=names[i];
		 if(i<len-1)sql+=",";
		}
	    sql+=") values( ";
	    for (int i = 0; i < len; i++) {
			sql+=values[i];
			 if(i<len-1)sql+=",";
		}
	    sql+=")";
	    return sql;
	 

	
}
}
