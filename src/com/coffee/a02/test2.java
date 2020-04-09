package com.coffee.a02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.coffee.entity.Student;
import com.sun.xml.internal.ws.message.stream.StreamAttachment;

public class test2 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Class cls=Class.forName("com.coffee.entity.Student");
		//Student objStudent=new Student();
		Object obj=cls.newInstance();
		Field idField=cls.getDeclaredField("id");
		Field nameField=cls.getDeclaredField("name");
		int mod=idField.getModifiers();
		//只有public可以直接访问
		if (Modifier.isPublic(mod)) {
			idField.set(obj, 202020202);
		}
		nameField.set(obj, "liuwei");
	  int id=	(Integer) idField.get(obj);
	  String name=(String) nameField.get(obj);
	  System.out.println(id +"|"+name);
		
	}

}
