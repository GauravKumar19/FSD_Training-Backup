package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Faculty;

public class FacultyTest {

	public static void main(String[] args) {
		
		ApplicationContext appCon= new ClassPathXmlApplicationContext("FacultyConfig.xml");
		Faculty pep=(Faculty)appCon.getBean("f1");
		pep.disp();
		
	}
}
