package org.aop.service.impl;

import org.aop.service.Thinker;

public class Volunteer implements Thinker {

	private String thoughts;

	@Override
	public void thinkOfSomeThing(String thoughts) {
		this.thoughts = thoughts;
	}

	public String getThoughts() {
		return this.thoughts;
	}

}
