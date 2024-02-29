package com.in28min.spring.basics.scope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplicationScopeApplication {
	private static Logger LOGGER=LoggerFactory.getLogger(SpringIn5StepsApplicationScopeApplication.class);
	public static void main(String[] args) {
		
		ApplicationContext context =SpringApplication.run(SpringIn5StepsApplicationScopeApplication.class, args);
		PersonDAO personDAO=context.getBean(PersonDAO.class);
		PersonDAO personDAO1=context.getBean(PersonDAO.class);
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConnection());
	}	

}
