package org.code.service.impl;

import org.code.service.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("people")
public class People {
	
	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;
	
	public void perform(){
		instrument.play();
	}
	
}
