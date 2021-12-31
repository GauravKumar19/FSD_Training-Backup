package com.coforge.training.springdemo.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Configuration Spring Bean Without XMl
//DI Using Setter by Annotations

/*
 * @Configuration annotation indicates that a class declares one or more 
 * @Bean methods and may be processed by the Spring container to generate 
 * bean definitions and service requests for those beans at runtime.
 * 
 * 
 * The @ComponentScan annotation is used with the
 * @Configuration annotation to tell Spring the packages to scan for annotated components.
 * 
 * 
 *  @Bean is a method-level annotation and a direct analog of the XML <bean/> element.
 */
@Configuration
@ComponentScan("com.coforge.training.springdemo.model.People")
public class PeopleConfig {

	@Bean(name="people")
	public People getpeople() {
		
		People p = new People();
		p.setName("Scarlet Jhonson");
		p.setAge(36);
		return p;
	}
}
