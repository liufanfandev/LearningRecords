package thinking;

import java.util.Random;

public class FinalTest {
	private static Random rand = new Random(47);
	private String id;
	public FinalTest(String id){
		this.id = id;
	}
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	public static final int VALUE_THREE = 39;
	private static final int i4 = rand.nextInt(20);
}
class Value{
	int i;
	public Value(int i) {
		this.i = i;
	}
}
