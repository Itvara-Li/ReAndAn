package com.coffee.a06;

import java.sql.Timestamp;
import java.util.Date;

import org.json.JSONObject;

import com.coffee.entity.Student;
import com.coffee.reflect.util.JSONUtil;

public class test2 {
	public static void main(String[] args) throws Exception {
		Student stu=new Student(20200001,"liuwei",true,"138111111");
		stu.setBirthday(new Timestamp(1586935009));
		 JSONObject jsonObject=JSONUtil.pojo2JSON(stu);
		 System.out.println(jsonObject.toString());
		
		
		
		
	}
   

  
}
