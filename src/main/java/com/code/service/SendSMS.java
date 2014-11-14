package com.code.service;

import org.springframework.stereotype.Service;

@Service("sendSMS")
public class SendSMS implements ISend {

	public void Send() {
		System.out.println("短信发送成功");

	}

}
