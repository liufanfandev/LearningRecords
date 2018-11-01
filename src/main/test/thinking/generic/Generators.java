package thinking.generic;

import java.util.Collection;

public class Generators {

	public static <T> Collection<T> fill(Collection<T> col,Generator<T> gen,int n){
		for (int i = 0; i < n; i++) {
			col.add(gen.next());
		}
		return col;
	}
}
