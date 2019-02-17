package com.starry.bean.constructorInitialzation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext("bean/constructorInitialzation.xml");
		Person person1 = iocContainer.getBean("person_1", Person.class);
		System.out.println(person1);
	}
}
