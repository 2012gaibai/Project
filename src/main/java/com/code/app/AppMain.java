package com.code.app;

import org.apache.log4j.Logger;

import com.code.entity.Mail;
import com.code.utils.SpringUtil;

public class AppMain {
	public static Logger logger=Logger.getLogger(AppMain.class);
	
	public static void main(String[] args) {
		System.out.println("hello");
		logger.info("------");
		Mail mail=(Mail) SpringUtil.getBean("mail");
		mail.mail();
		

	}
}
