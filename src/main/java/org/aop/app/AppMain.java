package org.aop.app;

import org.aop.service.Instrument;
import org.aop.service.MindReader;
import org.aop.service.Thinker;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	private static Logger logger=Logger.getLogger(AppMain.class);
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext-aop.xml");
			
		// Instrument instrument=(Instrument) context.getBean("hank");
		// try {
		// instrument.play();
		// //logger.info("正常");
		// } catch (Exception e) {
		// logger.warn("异常");
		// //e.printStackTrace();
		// }
		
		Thinker thinker=(Thinker) context.getBean("thinker");
		MindReader mindReader=(MindReader) context.getBean("magician");
		thinker.thinkOfSomeThing("喊喊");
		System.out.println(mindReader.getThoughts());
		
	}
}
