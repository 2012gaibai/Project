package com.code.service;

import org.aop.service.MindReader;
import org.aop.service.impl.Magician;
import org.aop.service.impl.Volunteer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:applicationContext-aop.xml")
@Component
public class MindReaderTest {

	@Autowired
	@Qualifier("thinker")
	Volunteer volunteer;

	@Autowired
	@Qualifier("magician")
	MindReader mindReader;

	@Test
	public void testThink() {
		volunteer.thinkOfSomeThing("123");
		Assert.assertEquals("123", mindReader.getThoughts());
	}
}
