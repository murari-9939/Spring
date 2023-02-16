package com.example1.springproject11;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Apphope {
	public static void main(String[] args) {
//	1>	launch aSpring Context
	var context=	new AnnotationConfigApplicationContext(Helloconfiguration .class);
//	2>	conigure the things that we want Spring to mangae
//		-@coniguratuion
//	3 retrive beans managed by spring
	System.out.println(context.getBean("name"));
	System.out.println(context.getBean("age"));
	System.out.println(context.getBean("address2"));
		
	}

}
