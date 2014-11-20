package org.code.service.impl;

import org.code.service.Performer;

public class Singer implements Performer {

	private String name;
	private int singenum;
	private Performer performer;

	public void perform() {

		System.out.println(name+"唱了"+singenum+"首歌");
		performer.perform();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSingenum() {
		return singenum;
	}

	public void setSingenum(int singenum) {
		this.singenum = singenum;
	}

	public Performer getPerformer() {
		return performer;
	}

	public void setPerformer(Performer performer) {
		this.performer = performer;
	}
	
	

}
