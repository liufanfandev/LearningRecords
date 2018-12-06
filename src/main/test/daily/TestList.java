package daily;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		/*List<String> list1 = new ArrayList<String>();
	    list1.add("A");
	    list1.add("B");
	    list1.add("C");

	    List<String> list2 = new ArrayList<String>();
	    list2.add("C");
	    list2.add("B");
	    list2.add("D");
	    // 交集
	    list1.retainAll(list2);
	    
	    System.out.println(list1);*/
		
		List<Person> list1 = new ArrayList<>();
		List<Person> list2 = new ArrayList<>();
		Person p1 = new Person();
		p1.setName("one");
		p1.setAge("111");
		list1.add(p1);
		
		Person p2 = new Person();
		p2.setName("two");
		p2.setAge("222");
		list1.add(p2);
		
		Person p3 = new Person();
		p3.setName("three");
		p3.setAge("333");
		list2.add(p3);
		
		list2.add(p1);
		list1.retainAll(list2);
	    
	    System.out.println(list1);

	}	
	
}
class Person{
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String toString(){
		return name + ":"+age;
	}
}
