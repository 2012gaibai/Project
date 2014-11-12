package com.code.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.code.utils.SpringUtil;

public class SendMail implements ISend {

	//private String from;
		
	public void Send() {
		//System.out.println("邮件发送成功");
		SimpleMailMessage smm=new SimpleMailMessage();
		JavaMailSenderImpl mailSender=(JavaMailSenderImpl) SpringUtil.getBean("sendMail");		
		smm.setFrom(mailSender.getUsername());
		smm.setTo("daxue513@126.com");
		smm.setSubject("测试");
		smm.setText("发送成功");
		mailSender.send(smm);
		System.out.println("--------");
	}
	

}
