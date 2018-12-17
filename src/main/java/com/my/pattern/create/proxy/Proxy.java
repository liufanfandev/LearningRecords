package com.my.pattern.create.proxy;

public class Proxy implements Subject{

	private Subject subject = null;
	public Proxy(){
		subject = new Proxy();
	}
	//通过构造函数传递参数
	public Proxy(Object...objects){
		
	}
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	private void before(){
		
	}
	private void after(){
		
	}

	
}
