package com.coffee.a01;
/**
 * 动态加载
 * @author coffeeliu
 *
 */
public class test1 {
 public static void main(String[] args) throws ClassNotFoundException {
	Class cls=Class.forName("com.coffee.entity.Student");
	System.out.println(cls.toString());
}
}
