package com.my.thinking.generic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Apply {

	public static <T,S extends Iterable<? extends T>> void apply(S seq,Method f,Object... args){
		try {
			for (T t : seq) {
				f.invoke(t, args);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) throws Exception{
			List<Shape> shapes = new ArrayList<>();
			for (int i = 0; i < 10; i++) {
				shapes.add(new Shape());
		}
	}
}
	class Shape{
			public void rotate(){
		System.out.println(this+"rotate");
	}
	public void resize(int newSize){
		System.out.println(this+"newSize"+newSize);
	}
}

class Square extends Shape{}

@SuppressWarnings("serial")
class FilledList<T> extends ArrayList<T>{
	public FilledList(Class<? extends T> type,int size ){
		try {
			for (int i = 0; i < size; i++) {
				add(type.newInstance());
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		} 
	}
}
