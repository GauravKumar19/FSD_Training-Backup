package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Pupil;


public class PupilApp {
	
	public static void main(String[] args) {
	ApplicationContext appCon= new ClassPathXmlApplicationContext("PupilConfig.xml");
	Pupil pupil=(Pupil)appCon.getBean("pupil1");
	System.out.println("pupil Details");
	System.out.println("pupil Id: "+pupil.getId());
	System.out.println("pupil Name: "+pupil.getName());
	pupil.showHobbies();;

	}
}