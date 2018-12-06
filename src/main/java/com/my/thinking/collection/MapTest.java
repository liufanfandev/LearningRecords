package com.my.thinking.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"小明");
		map.put(2, "小红");
		map.put(3, "小绿");
		Set entry = map.entrySet();
		Iterator it = entry.iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> me = (Entry<Integer, String>) it.next();
			System.out.println(me.getKey()+"===="+me.getValue());
		}
	}
}
