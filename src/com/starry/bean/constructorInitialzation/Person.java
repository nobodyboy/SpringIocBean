package com.starry.bean.constructorInitialzation;
public class Person {
	private String name;
	private int age;
	public Person(){
		name = "zhangSan";
		age = 25;
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString(){
		return "person:" + name + ", " + age;
	}
}
