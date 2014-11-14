package com.code.job;

import javax.annotation.Resource;

import com.code.service.ISend;
import com.code.service.SendFactory;

public class EmailJob {
	@Resource
	SendFactory sendFactory;

	public void excute() {
		
		// System.out.println("---邮件发送-----");
		ISend iSend = null;
		iSend = sendFactory.createSend("email");
		iSend.Send();
		iSend = sendFactory.createSend("SMS");
		iSend.Send();
	}
}
