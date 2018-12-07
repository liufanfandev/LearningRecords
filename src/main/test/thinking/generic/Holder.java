package thinking.generic;

public class Holder<T> {

	private T value;
	public Holder(){
		
	}
	public Holder(T value){
		this.value = value;
	}
	public void set(T value){
		this.value = value;
	}
	public T get(){
		return value;
	}
	public boolean equals(Object obj){
		return value.equals(obj);
	}
}
