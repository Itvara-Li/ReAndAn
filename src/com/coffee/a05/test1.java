package com.coffee.a05;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.json.JSONObject;

import com.coffee.entity.Student;

import sun.org.mozilla.javascript.internal.json.JsonParser;

public class test1 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Student student=new Student();
		student.setId(20202020);
		student.setName("liuwei");
		student.setSex(true);
		student.setBirthday(new Date());
		student.setPhone("1380000111");
		//pojo->json
		JSONObject jsonObject=new JSONObject();
//		jsonObject.put("id", student.getId());
//		jsonObject.put("name", student.getName());
//		jsonObject.put("sex", student.getSex());
//		jsonObject.put("brithday", student.getBirthday());
//		jsonObject.put("phone", student.getPhone());
		jsonObject=JSONutil.pojo2JSON(student);
		System.out.println(jsonObject.toString());

	}

}
