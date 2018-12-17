package com.my.pattern.create.build;

public abstract class Builder {

	//设置产品的不同部分，以获取不同的产品
	public abstract void setPart();
	public abstract Product getProduct();
}
