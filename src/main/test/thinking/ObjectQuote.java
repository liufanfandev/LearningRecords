package thinking;

public class ObjectQuote {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 49;
		System.out.println("t1.level:"+t1.level+"t2.level:"+t2.level);
		t1 = t2;
		System.out.println("t1.level:"+t1.level+"t2.level:"+t2.level);
		t2.level = 27;
		System.out.println("t1.level:"+t1.level+"t2.level:"+t2.level);
	}
}
class Tank{
	int level;
}
