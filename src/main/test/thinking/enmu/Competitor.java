package thinking.enmu;

public interface Competitor<T extends Competitor<T>> {

	Outcome compete(T competitor);
}
