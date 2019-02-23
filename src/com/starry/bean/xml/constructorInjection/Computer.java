package com.starry.bean.xml.constructorInjection;

import java.util.List;

public class Computer implements ElectronicProducts {
	// 实例1
	private Mouse mouse;
	// 实例3
	private String name;
	private int price;
	// 实例4
	private List<String> cpuList;
	public Computer(Mouse mouse, String name, int price, List<String> cpuList) {
		this.mouse = mouse;
		this.name = name;
		this.price = price;
		this.cpuList = cpuList;
	}
	@Override
	public void doSomething() {
		// 实例1
		//System.out.println("computer...");
		//mouse.doSomething();
		
		// 实例3
		//System.out.println("computer... 品牌：" + name + ", 价格：" + price );
		//mouse.doSomething();
		
		// 实例4
		System.out.println("computer... 品牌：" + name + ", 价格：" + price + ", cpu：" + cpuList );
		mouse.doSomething();
	}
}
