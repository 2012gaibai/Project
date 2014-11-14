package com.code.service;

import javax.annotation.Resource;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.code.entity.Mail;
import com.code.utils.SpringUtil;

@Service("sendMail")
public class SendMail implements ISend {

	// private String from;
	@Resource
	private JavaMailSenderImpl javaMailSender;

	public void Send() {
		// System.out.println("邮件发送成功");
		/*
		 * JavaMailSenderImpl mailSender = (JavaMailSenderImpl) SpringUtil
		 * .getBean("sendMail");
		 */
		String [] to={"daxue513@126.com","qi.gan@successlottery.com"};

		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setFrom(javaMailSender.getUsername());
		smm.setTo(to);
		smm.setSubject("测试");
		smm.setText("发送成功");
		javaMailSender.send(smm);
		System.out.println("--------");
	}



}
