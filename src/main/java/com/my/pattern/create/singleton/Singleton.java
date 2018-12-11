package com.my.pattern.create.singleton;

public class Singleton {

	private static final Singleton singleton = new Singleton();
	//限制生产多个对象
	private Singleton(){
		
	}
	//通过该方法获取实例对象
	public static Singleton getInstance(){
		return singleton;
	}
	//类中的其他方法尽量是 static
	public static void something(){
		
	}
}
