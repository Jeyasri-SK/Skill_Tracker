package com.skill.tracker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkillTrackerAddApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(SkillTrackerAddApplication.class);
	
	public static void main(String args[]) {
		try {
			LOGGER.error("Begin SkillTrackerAddApplication - args: "+ args);
			SpringApplication.run(SkillTrackerAddApplication.class, args);
		} catch(Exception e) {
			LOGGER.error("Exception in SkillTrackerAddApplication: "+ e);
		}		
	}
}