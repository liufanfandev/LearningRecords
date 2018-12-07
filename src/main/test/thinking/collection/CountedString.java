package thinking.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountedString {

	private static List<String> created = new ArrayList<>();
	private String s;
	private int id = 0;
	private Object o;
	public CountedString(String str){
		s = str;
		created.add(str);
		for (String string : created) {
			id++;
		}
	}
	public String toString(){
		return "String:"+s+"id:"+id+"hasCode()"+hashCode();
	}
	public int hashCode(){
		int result = 17;
		result = 37 * result + s.hashCode();
		result = 37 * result + id;
		return result;
	}
	public boolean equals(Object o){
		return o instanceof CountedString && s.equals(((CountedString)o).s) && id == ((CountedString)o).id;
	}
	public static void main(String[] args) {
		Map<CountedString,Integer> map = new HashMap<CountedString,Integer>();
		CountedString[] cs = new CountedString[5];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = new CountedString("hi");
			map.put(cs[i], i);
		}
		System.out.println(map);
		for (int i = 0; i < cs.length; i++) {
			System.out.println("Looking up "+cs[i]);
			System.out.println(map.get(cs[i]));
		}
		
	}
	
}
