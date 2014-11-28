package org.aop.service.impl;

import org.aop.service.Instrument;

public class Harmonica implements Instrument {

	@Override
	public void play() throws Exception {
		int i=0;
		
		if(i==0){
			System.out.println("乐器是harmonica");
		}else {
			throw new Exception();
		}
		
	}

}
