package com.my.pattern.create.build;

public class ConcreteBuilder extends Builder{

	private Product product = new Product();
	//设置产品
	@Override
	public void setPart() {
		/**
		 * 产品类内部的逻辑
		 */
	}
	//组建一个产品
	@Override
	public Product getProduct() {
		return product;
	}

	
}
