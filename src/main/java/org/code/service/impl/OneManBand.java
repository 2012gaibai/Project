package org.code.service.impl;

import java.util.Collection;

import org.code.service.Instrument;
import org.code.service.Performer;

public class OneManBand implements Performer {

	public OneManBand(){
		
	}
	
	@Override
	public void perform() {
		for(Instrument instrument:instruments){
			instrument.play();
		}
	}
	
	private Collection<Instrument> instruments;

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
	
}
