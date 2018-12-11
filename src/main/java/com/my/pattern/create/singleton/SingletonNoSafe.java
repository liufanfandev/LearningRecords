package com.my.pattern.create.singleton;

public class SingletonNoSafe {

	private static SingletonNoSafe singleton = null;
	//限制生产多个对象
	private SingletonNoSafe(){
		
	}
	//通过该方法获取实例对象
	public static SingletonNoSafe getInstance(){
		if(singleton == null){
			singleton = new SingletonNoSafe();
		}
		return singleton;
	}
	//类中的其他方法尽量是 static
	public static void something(){
		
	}
}
