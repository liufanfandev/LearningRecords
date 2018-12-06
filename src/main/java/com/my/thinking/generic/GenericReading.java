package com.my.thinking.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericReading {

	static <T> T readExact(List<T> list){
		return list.get(0);
	}
	static List<Apple> apples = Arrays.asList(new Apple());
	static List<Fruit> fruit = Arrays.asList(new Fruit());
	static void f1(){
		Apple a = readExact(apples);
		Fruit f = readExact(fruit);
		f = readExact(apples);
	}
	static class Reader<T>{
		 T readExact(List<T> list){
			return list.get(0);
		}
	}
	static void f2(){
		Reader<Fruit> reader = new Reader<>();
		Fruit f = reader.readExact(fruit);
	}
	
	public static void main(String[] args) {
		List<? super Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit());
		fruits.add(new Apple());
		Apple f = (Apple) fruits.get(0);
		for (Object object : fruits) {
			System.out.println(object.toString());
		}
	}
	
	
	
	
	
}
class Fruit{
	
}
class Apple extends Fruit{
	
}
class Jonathan extends Apple{
	
}
class Orange extends Fruit{
	
}
