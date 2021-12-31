package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.People;
import com.coforge.training.springdemo.model.PeopleConfig;

public class PeopleApp {

	public static void main(String[] args) {

			ApplicationContext appCon= new AnnotationConfigApplicationContext(PeopleConfig.class);
			People pep=(People)appCon.getBean("people",People.class);
			pep.display();
			

			}
		
	}


