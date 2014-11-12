package com.code.job;

import com.code.service.ISend;
import com.code.service.SendFactory;

public class EmailJob {

	public void excute() {
		// System.out.println("---邮件发送-----");
		ISend iSend = null;
		iSend = SendFactory.createSend("email");
		iSend.Send();
		iSend = SendFactory.createSend("SMS");
		iSend.Send();
	}
}
