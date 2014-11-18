package com.code.controller;

import com.code.service.Quest;

public class QuestController {
	
	private Quest quest;
	
	public QuestController(Quest quest){
		this.quest=quest;
	}
	
	public void remarkOnQuest(){
		quest.embark();
	}
}
