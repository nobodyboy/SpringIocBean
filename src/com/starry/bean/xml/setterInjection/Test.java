package com.starry.bean.xml.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.starry.bean.xml.constructorInjection.ElectronicProducts;

public class Test {
	public static void main(String[] args) {
		// 构造器注入
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean/xml/setterInjection.xml");
		ElectronicProducts computer = applicationContext.getBean("computer", ElectronicProducts.class);
		computer.doSomething();
		
		// c-命名空间注入
		ApplicationContext applicationContext_p = new ClassPathXmlApplicationContext("bean/xml/setterInjection_p.xml");
		ElectronicProducts computer_p = applicationContext_p.getBean("computer", ElectronicProducts.class);
		computer_p.doSomething();
	}
}
