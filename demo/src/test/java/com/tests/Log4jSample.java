package com.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Log4jSample {
	
	WebDriver driver;
	
	@Test
	public void RootLoggerDemo() {
		
		Logger log = Logger.getRootLogger();
		
		log.trace("Trace Message");
		log.debug("debug Message");
		log.info("info Message");
		log.warn("warn Message");
		log.error("error Message");
		log.fatal("fatal Message");
	}
	
	
	@Test
	public void ManualLoggerDemo() {
		
		Logger log = Logger.getLogger("manualLogger");
		log.trace("Trace Message");
		log.debug("debug Message");
		log.info("info Message");
		log.warn("warn Message");
		log.error("error Message");
		log.fatal("fatal Message");
		
		
	}

}
