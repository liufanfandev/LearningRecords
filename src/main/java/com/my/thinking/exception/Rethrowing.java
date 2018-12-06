package com.my.thinking.exception;

public class Rethrowing {

	public static void f() throws Exception{
		System.out.println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}
	
	public static void g() throws Exception{
		f();
	}
	
	public static void main(String[] args) {
		try {
			f();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			g();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
