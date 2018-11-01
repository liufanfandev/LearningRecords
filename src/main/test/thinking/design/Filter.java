package thinking.design;

public class Filter {

	public String name(){
		return getClass().getSimpleName();
	}
	public WaveForm process(WaveForm input){
		return input;
	}
}
