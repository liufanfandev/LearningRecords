package thinking.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformce {

	static Random rand = new Random();
	static int reps = 1000;
	static List<Test<List<Integer>>> tests = new ArrayList<Test<List<Integer>>>();
	static List<Test<LinkedList<Integer>>> qTests = new ArrayList<Test<LinkedList<Integer>>>();
	static{
		tests.add(new Test<List<Integer>>("add"){

			@Override
			int test(List<Integer> list, TestParam tp) {
				int loops = tp.loops;
				int size = tp.size;
				for (int i = 0; i < loops; i++) {
					list.clear();
					for (int j = 0; j < size; j++) {
						list.add(j);
					}
				}
				return loops * size;
			}
		});
	}
}
