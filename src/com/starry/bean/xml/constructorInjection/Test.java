package com.starry.bean.xml.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 构造器注入
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean/xml/constructorInjection.xml");
		ElectronicProducts computer = applicationContext.getBean("computer", ElectronicProducts.class);
		computer.doSomething();
		
		// c-命名空间注入
		ApplicationContext applicationContext_c = new ClassPathXmlApplicationContext("bean/xml/constructorInjection_c.xml");
		ElectronicProducts computer_c = applicationContext_c.getBean("computer", ElectronicProducts.class);
		computer_c.doSomething();
	}
}
