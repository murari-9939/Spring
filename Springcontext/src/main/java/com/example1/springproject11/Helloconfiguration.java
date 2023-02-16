package com.example1.springproject11;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//it is custom class
//elimainate verbosity in creating java beans
//public accessor methods, constrctors
//eqals,hashcode and tostring are automatically created
//released in jdk 16
record Person(String name, int age) {};
	

@Configuration
public class Helloconfiguration {
	@Bean
	public String name() {
		return "murari";
		
	}
	
	@Bean
	public int age() {
		return 12;
		
	}
//cutomizing bean name
	@Bean(name="address2")
	public Person person() {
//		var Person =new Person("ganesh",35);
//		return Person;
		return  new Person("ganesh",35);
	}
}
