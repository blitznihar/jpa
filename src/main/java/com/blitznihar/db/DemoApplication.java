package com.blitznihar.db;

import com.blitznihar.db.cruds.PersonRepository;
import com.blitznihar.db.services.AppProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.blitznihar.db")
@EnableJpaRepositories(basePackageClasses = PersonRepository.class )
@PropertySource("classpath:app.properties")
public class DemoApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		//IEmployeeService employeeService = (EmployeeService)ctx.getBean(EmployeeService.class);
		AppProperties appProperties = (AppProperties)ctx.getBean(AppProperties.class);
		int empId = appProperties.returnEmployeeId();
		LOGGER.info("Some Info {}",empId);
		//employeeService.updateCalls(empId);
	}

}
