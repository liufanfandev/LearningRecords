package com.my.pattern.create.template;

public class Client {

	public static void main(String[] args) {
		AbstractClass a1 = new ConcreteClass1();
		AbstractClass a2 = new ConcreteClass2();
		a1.templateMethod();
		a2.templateMethod();
	}
}
