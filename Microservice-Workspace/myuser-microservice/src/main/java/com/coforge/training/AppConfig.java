package com.coforge.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import brave.sampler.Sampler;

@Configuration
public class AppConfig {

	//Collects data from Sleuth and provides it to Zipkin Client
	//Sampler messages can be of any type such as DEBUG, INFO, WARN, ERROR etc.
		@Bean
		public Sampler samplerOb() {

		return Sampler.ALWAYS_SAMPLE;
		}
}
