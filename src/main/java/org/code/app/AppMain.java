package org.code.app;

import org.code.service.Performer;
import org.code.service.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext-spring.xml");

		Performer performer =  (Performer) context.getBean("duke2");
		performer.perform();
		
		Stage stage=Stage.getInstance();
		System.out.println(stage);
	
		
	}
}
