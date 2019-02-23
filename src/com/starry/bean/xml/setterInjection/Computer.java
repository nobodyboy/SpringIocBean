package com.starry.bean.xml.setterInjection;

import java.util.List;

import com.starry.bean.xml.constructorInjection.ElectronicProducts;
import com.starry.bean.xml.constructorInjection.Mouse;

public class Computer implements ElectronicProducts {
	// 实例6
	private Mouse mouse;
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	// 实例7
	private String name;
	private int price;
	private List<String> cpuList;
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public void setCpuList(List<String> cpuList) {
		this.cpuList = cpuList;
	}
	@Override
	public void doSomething() {
		// 实例6
		//System.out.println("computer...");
		//mouse.doSomething();
		
		// 实例7
		System.out.println("computer... name: " + name + ", price: " + price + ", cpuList: " + cpuList);
		mouse.doSomething();
	}
}
