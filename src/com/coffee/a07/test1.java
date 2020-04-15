package com.coffee.a07;

import java.sql.Timestamp;
import java.util.Date;

import com.coffee.entity.Student;

/**
 * 不用反射和注解普通sql使用
 * @author coffeeliu
 *
 */
public class test1 {
public static void main(String[] args) {
	
	Student stu=new Student(20200888,"liuwei",true,"138111111");
	stu.setBirthday(new Date());
	//insert into `student` (kdkdkdkdkdkdk) values(xxxxxxxxxx)
    	String sql="insert into `%s`(%s,%s,%s,%s,%s) values('%s','%s','%s','%s','%s')";
    	String ss=String.format(sql, "student","id","name","sex","phone","birthday",
    			stu.getId().toString(),stu.getName(),stu.getSex()?1:0,stu.getPhone(),stu.getBirthday().toLocaleString());
     System.out.println(ss);
}
}
