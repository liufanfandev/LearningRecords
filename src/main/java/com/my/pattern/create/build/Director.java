package com.my.pattern.create.build;

public class Director {
	
	private Builder builder = new ConcreteBuilder();
	//构建不同的产品
	public Product getProduct(){
		builder.setPart();
		return builder.getProduct();
	}
	
}
