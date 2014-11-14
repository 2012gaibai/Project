package com.code.app;

import org.apache.log4j.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AppMain {
	public static Logger logger = Logger.getLogger(AppMain.class);



	public static void main(String[] args) {		
		logger.info("------");
		init();
		
		
	}

	public static void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext-test.xml");
	}

}
