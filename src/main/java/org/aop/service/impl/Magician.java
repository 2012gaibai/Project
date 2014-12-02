package org.aop.service.impl;

import org.aop.service.MindReader;

public class Magician implements MindReader {

	private String thoughts;

	@Override
	public void interceptThroughts(String thoughts) {
		System.out.println("志愿者的想法：");
		this.thoughts = thoughts;
	}

	@Override
	public String getThoughts() {
		return this.thoughts;
	}

}
