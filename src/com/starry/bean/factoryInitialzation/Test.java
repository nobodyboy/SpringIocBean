package com.starry.bean.factoryInitialzation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.starry.bean.constructorInitialzation.Person;
public class Test {
	public static void main(String[] args) {
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext("bean/factoryInitialzation.xml");
		Person person1 = iocContainer.getBean("person2", Person.class);
		System.out.println(person1);
	}
}
