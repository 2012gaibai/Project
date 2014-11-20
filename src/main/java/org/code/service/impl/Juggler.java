package org.code.service.impl;

import org.code.service.Performer;

public class Juggler implements Performer {

	private int beanBags = 3;

	public Juggler() {

	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() {
		System.out.println("Juggler" + beanBags + "beaBags");
	}

}
