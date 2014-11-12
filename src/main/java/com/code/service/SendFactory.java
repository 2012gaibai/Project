package com.code.service;

public class SendFactory {
	public static ISend createSend(String str) {
		ISend iSend = null;
		switch (str) {
		case "email":
			iSend = new SendMail();
			break;
		case "SMS":
			iSend = new SendSMS();
			break;

		}
		return iSend;
	}
}
