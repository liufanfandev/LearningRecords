package com.my.pattern.create;
/**
 * 单例模式普通类
 *
 */
public class Emperor {
	private static final Emperor emperor = new Emperor();
	private Emperor(){
		
	}
	public static Emperor getInstance(){
		return emperor;
	}
	public static void say(){
		System.out.println("我是皇帝某某。。。。");
	}

}
