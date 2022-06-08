package com.example.onetoonedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnetoonedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetoonedemoApplication.class, args);
		ApplicationContext context;
		context=SpringApplication.run(OnetoonedemoApplication.class, args);
		 rolerepository role;
		 role= context.getBean(rolerepository.class);
		 EmpRepository emp;
		 emp=context.getBean(EmpRepository.class);
		 Role r1 = new Role(1,"admin");
		 role.save(r1);
		 Role r2 = new Role(2,"HR");
		 role.save(r2);
		 Role r3 = new Role(3,"Manager");
		 role.save(r3);
		 Emp e1 = new Emp(100,"abc",r2);
		 emp.save(e1);
		 Emp e2 = new Emp(200,"xyz",r1);
		 emp.save(e2);
	}

}
