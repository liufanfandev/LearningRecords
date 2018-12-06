package com.my.thinking.collection;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Countries {

	public static final String[][] DATA = {
			{"111","aaa"},{"222","bbb"},{"333","ccc"},{"444","ddd"},
			{"555","eee"},{"666","fff"},{"777","ggg"},{"888","hhh"}
	};
	
	private static class FlyweightMap extends AbstractMap<String, String>{

		private static class Entry implements Map.Entry<String,String>{

			int index;
			Entry(int index){
				this.index = index;
			}
			
			public boolean equeals(Object o){
				return DATA[index][0].equals(o);
			}
			
			@Override
			public String getKey() {
				return DATA[index][0];
			}

			@Override
			public String getValue() {
				return DATA[index][1];
			}

			@Override
			public String setValue(String value) {
				throw new UnsupportedOperationException();
			}
			public int hashCode(){
				return DATA[index][0].hashCode();
			}
			
		}
		@Override
		public Set<java.util.Map.Entry<String, String>> entrySet() {
			return null;
		}
	}
	static class EntrySet extends AbstractSet<Map.Entry<String, String>>{

		int size;
		
		EntrySet(int size){
			if(size <0){
				this.size = 0;
			}else if(size >DATA.length){
				this.size = DATA.length;
			}else{
				this.size = size;
			}
		}
		
		@Override
		public Iterator<Entry<String, String>> iterator() {
			return null;
		}
		
		private class Iter implements Iterator<Map.Entry<String, String>>{

			//private Entry entry = new Entry(-1);
			 
			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public Entry<String, String> next() {
				return null;
			}

			@Override
			public void remove() {
				
			}
			
		}

		@Override
		public int size() {
			return size;
		}
		
	}
}
