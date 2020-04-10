package com.coffee.a05;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.json.JSONObject;

import com.coffee.entity.Student;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class test2 {
public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	//json->pojo
	JSONObject json=new JSONObject();
	json.put("id", 20200001);
	json.put("name", "liuwei");
	json.put("sex", true);
	json.put("brithday", new Date());
	json.put("phone", "1380515050");
	
	Student stu=new Student();
	
  stu=	(Student) JSONutil.JSON2pojo(json, Student.class);
	System.out.println(stu.getName());
}
}
