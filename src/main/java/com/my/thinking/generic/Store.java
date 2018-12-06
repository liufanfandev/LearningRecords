package com.my.thinking.generic;

import java.util.ArrayList;
import java.util.Random;

public class Store extends ArrayList<Aisle>{

	public Store(int nAisles,int nShelves,int nProducts){
		for (int i = 0; i < nAisles; i++) {
			add(new Aisle(nShelves, nProducts));
		}
	}
	
	public String toString(){
		StringBuilder result = new StringBuilder();
		for (Aisle a : this) {
			for (Shelf f : a) {
				for (Product p : f) {
					result.append(p);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		System.out.println(new Store(4, 5, 10));
	}
}
class Product{
	
	private final int id;
	private String description;
	private double price;
	
	public Product(int iDnumber,String desc,double price){
		this.id = iDnumber;
		this.description = desc;
		this.price = price;
	}
	
	public String toString(){
		return id +":"+description+",price"+price;
	}
	
	public void changePrice(double change){
		price += change;
	}
	
	public static Generator<Product> generator = new Generator<Product>() {
		Random rand = new Random(47);
		
		@Override
		public Product next() {
			return new Product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble()* 1000.0)+0.99);
		}
	
	};
}
class Shelf extends ArrayList<Product>{
	public Shelf(int nProducts){
		Generators.fill(this, Product.generator, nProducts);
	}
}
class Aisle extends ArrayList<Shelf>{
	public Aisle(int nShelves,int nProducts){
		for (int i = 0; i < nShelves; i++) {
			add(new Shelf(nProducts));
		}
	}
}

