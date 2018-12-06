package com.my.thinking.collection;

import java.util.LinkedHashSet;
import java.util.Set;

import com.my.thinking.generic.Generator;

public class CollectionDataTest {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(), 10));
		set.addAll(CollectionData.list(new Government(), 10));
		System.out.println(set);
	}
}
class Government implements Generator<String>{

	String[] foundation = ("you can you up , no can no bb !").split(" ");
	
	private int index;
	
	@Override
	public String next() {
		// TODO Auto-generated method stub
		return foundation[index++];
	}
}
