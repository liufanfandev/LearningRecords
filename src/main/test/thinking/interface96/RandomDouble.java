package thinking.interface96;

import java.util.Random;

public class RandomDouble {

	private static Random rand = new Random(47);
	public double next(){
		return rand.nextDouble();
	}
	public static void main(String[] args) {
		RandomDouble rd = new RandomDouble();
		for (int i = 0; i < 7; i++) {
			System.out.println(rd.next()+" ");
		}
	}
}
