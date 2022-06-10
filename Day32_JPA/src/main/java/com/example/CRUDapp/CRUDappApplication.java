package com.example.CRUDapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CRUDappApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(CRUDappApplication.class, args);
		StudentRepository stud = context.getBean(StudentRepository.class);
		// create row
		Student st = new Student(10, "ryt");
		stud.save(st);
		System.out.println("Record saved");

		SpringApplication.run(CRUDappApplication.class, args);
	}


	}


