package com.coffee.a04;

public class test1 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls=Class.forName("com.coffee.entity.Student");
		Object obj=cls.newInstance();//创建实例

	}

}
