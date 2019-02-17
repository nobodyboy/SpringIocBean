package com.starry.bean.staticFactoryInitialzation;

import com.starry.bean.constructorInitialzation.Person;
public class PersonStaticFactory {
	public static Person getPersonBean(String name, int age){
		return new Person(name, age);
	}
}

//staticFactoryInitialzation.xml