package com.coffee.a08;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Globals {
	
//	public static Car car=new Car();
//	public static Plane plane=new Plane();
//	public static Train train=new Train();
	public static void foo() {
		
	}
	private static Map<String, Object> map=new HashMap<String, Object>();
//	public static void init() {
//		Car car=new Car();
//		map.put("car", car);
//		Plane plane=new Plane();
//		map.put("plane", plane);
//		Train train=new Train();
//		map.put("train", train);
//	}
	static{
		try {
			loadConfig();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
   public static Object get(String name) {
	return map.get(name);
}
	 private static void loadConfig() throws Exception {
		 InputStream stream=Globals.class.getResourceAsStream("Globals.xml");
		 if (stream==null) {
			throw new Exception("找不到xml文件");
		}
		 SAXReader reader= new SAXReader();
		 Document doc=reader.read(stream);
		 stream.close();
		 
		 Element root=doc.getRootElement();
		 List<Element> ServiceList=root.elements("global");
		 for (Element element:ServiceList) {
			String name=element.attributeValue("name").trim();
			String classname=element.attributeValue("class").trim();
			String init=element.attributeValue("init"); 
			 Class cls=Class.forName(classname);
			 Object obj=cls.newInstance();
			 map.put(name, obj);
			 
			 if (init!=null) {
				Method initMethod=cls.getMethod(init.trim());
				initMethod.invoke(obj);
			}
			 
		}
	}
}
