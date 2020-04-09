package com.coffee.Example;

public class Example {
	 public void test1() {
	      System.out.printf("** Example.test1 ... \n", new Object[0]);
	   }

	   public void test2(Integer a, Integer b) {
	      System.out.printf("** Example.test2 :  %d + %d = %d \n", new Object[]{a, b, Integer.valueOf(a.intValue() + b.intValue())});
	   }

	   public void test3(double a, double b) {
	      System.out.printf("** Example.test3 :  %f * %f = %f \n", new Object[]{Double.valueOf(a), Double.valueOf(b), Double.valueOf(a * b)});
	   }

	   public Integer test4(Integer a, Integer b) {
	      System.out.printf("** Example.test4 :  %d + %d = ? \n", new Object[]{a, b});
	      return Integer.valueOf(a.intValue() + b.intValue());
	   }

	   public double test5(double a, double b) {
	      System.out.printf("** Example.test5 :  %f * %f = ? \n", new Object[]{Double.valueOf(a), Double.valueOf(b)});
	      return a * b;
	   }
}
