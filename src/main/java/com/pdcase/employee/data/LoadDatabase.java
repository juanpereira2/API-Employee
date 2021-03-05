package com.pdcase.employee.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pdcase.employee.modal.Employee;
import com.pdcase.employee.repository.EmployeeRepository;
@Configuration
class LoadDatabase {

	  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	  
	  @Bean
	  CommandLineRunner initDatabase(EmployeeRepository repository) {
		  return args ->{
			  log.info("Preloading: "+ repository.save(new Employee("Juan Pereira","Dev")));

			  log.info("Preloading:  "+ repository.save(new Employee("Renan Pereira","farmacia")));
		  };
	  }
	  
}
