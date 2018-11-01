package thinking.generic;

public class LinkStack<T> {

	private static class Node<U>{
		U item;
		Node<U> next;
		Node(){
			item = null;next = null;
		}
		Node(U item,Node<U> next){
			this.item = item;
			this.next = next;
		}
		boolean end(){
			return item == null && next ==null; 
		}
	}
	
	private Node<T> top = new Node<>();
	public void push(T item){
		top = new Node<T>(item, top);
	}
	public T pop(){
		T result = top.item;
		if(!top.end()){
			top = top.next;
		}
		return result;
	}
	public static void main(String[] args) {
		LinkStack<String> link = new LinkStack<>();
		for(String s : "Phasers on stun!".split(" "))
			link.push(s);
		String s;
		while((s=link.pop())!=null){
			System.out.println(s);
		}
	}
}
