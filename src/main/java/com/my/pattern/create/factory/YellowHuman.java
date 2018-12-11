package com.my.pattern.create.factory;

public class YellowHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("黄色人种的肤色是黄色的！");
	}

	@Override
	public void talk() {
		System.out.println("黄种人会说话，一般是双字节！");
		
	}

}
