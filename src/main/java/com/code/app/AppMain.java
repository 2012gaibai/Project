package com.code.app;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.code.controller.QuestController;
import com.code.utils.SpringUtil;



public class AppMain {
	public static Logger logger = Logger.getLogger(AppMain.class);


	

	public static void main(String[] args) {		
		logger.info("------");
		//init();
		//questController.remarkOnQuest();
		QuestController questController=(QuestController) SpringUtil.getBean("questController");
		questController.remarkOnQuest();
		
		
		
	}

	public static void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext-test.xml");
	}

}
