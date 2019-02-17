package com.starry.bean.factoryInitialzation;

import com.starry.bean.constructorInitialzation.Person;
public class PersonFactory {
	public Person getPersonBean(String name, int age){
		return new Person(name, age);
	}
}
