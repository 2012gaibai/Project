package com.code.service;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.code.controller.QuestController;
import com.code.utils.SpringUtil;

public class TestQuestController {
	/*
	 * public static void main(String[] args) {
	 * System.out.println("Test start.");
	 */
	// ApplicationContext context = new ClassPathXmlApplicationContext(
	// "classpath:applicationContext.xml");
	// 如果配置文件中将startQuertz bean的lazy-init设置为false 则不用实例化
	// context.getBean("startQuertz");
	// System.out.print("Test end..");}

	private ApplicationContext context;
	
	
	public void setUp(){
		context=new ClassPathXmlApplicationContext("classpath:applicationContext-test.xml");
	}
	
	
	public void testRemarkOnQuest() {
		QuestController questController = (QuestController) context
				.getBean("questController");
		questController.remarkOnQuest();
	}

}
