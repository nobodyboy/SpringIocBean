package com.starry.bean.staticFactoryInitialzation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.starry.bean.constructorInitialzation.Person;

public class Test {
	public static void main(String[] args) {
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext("bean/staticFactoryInitialzation.xml");
		Person person1 = iocContainer.getBean("personStaticFactory", Person.class);
		System.out.println(person1);
	}
}
