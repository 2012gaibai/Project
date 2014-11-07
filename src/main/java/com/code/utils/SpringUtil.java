package com.code.utils;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {

	private static ApplicationContext context;
	static {
		context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");
	}
	
	public static Object getBean(String bean){
		Object object=context.getBean(bean);
		return object;
	}

}
