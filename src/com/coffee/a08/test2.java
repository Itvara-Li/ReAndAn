package com.coffee.a08;

public class test2 {
public static void main(String[] args) {
	Globals.foo();
	 
	Car car=(Car) Globals.get("car");
	car.run();
}
}
