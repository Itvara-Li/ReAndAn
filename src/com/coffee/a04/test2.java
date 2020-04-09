package com.coffee.a04;

import com.coffee.entity.Student;

public class test2 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	//类加载方式1
	//Class cls=Class.forName("com.coffee.entity.Student");
	//方式2
	Student stu=new Student();
	//Class cls=stu.getClass();
	//方式3
	Class cls=Student.class;
	
	Object obj=cls.newInstance();//创建实例
}
}
