package com.code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.code.utils.SpringUtil;

@Component
public class SendFactory {
	@Autowired
	@Qualifier("sendMail")
	ISend sendMail;

	@Autowired
	@Qualifier("sendSMS")
	ISend sendSMS;

	public ISend createSend(String str) {
		ISend iSend = null;
		switch (str) {
		case "email":
			iSend = sendMail;
			break;
		case "SMS":
			iSend = sendSMS;
			break;
		default:
			break;

		}
		return iSend;
	}
}
