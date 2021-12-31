package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Person;

public class PersonApp {

	public static void main(String[] args) {
		
		ApplicationContext appCon= new ClassPathXmlApplicationContext("PersonConfig.xml");
		Person person =(Person)appCon.getBean("p1");
		System.out.println("Person Details");
		System.out.println("Person Id: "+person.getId());
		System.out.println("Person Name: "+person.getName());
		person.showPhoneNos();
	}
}
