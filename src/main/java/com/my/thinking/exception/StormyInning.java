package com.my.thinking.exception;

public class StormyInning extends Inning implements Storm{

	public StormyInning() throws BaseBallException,RainedOut {}
	public StormyInning(String s) throws BaseBallException,Foul{}
	
	public void event(){
		
	}
	
	
	@Override
	public void rainHard() throws RainedOut {

		
	}

	@Override
	public void atBat() throws PopFoul{

		
	}
	
	/*public void walk() throws Foul{
		
	}*/
	
	public static void main(String[] args) {
		
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (RainedOut e) {
			e.printStackTrace();
		} catch (BaseBallException e) {
			e.printStackTrace();
		}
		
	}

}
class BaseBallException extends Exception{}
class Foul extends BaseBallException{}
class Strike extends BaseBallException{}
abstract class Inning{
	public Inning() throws BaseBallException{}
	public void event() throws BaseBallException{}
	public abstract void atBat() throws Foul,Strike;
	public void walk(){
		
	}
}
class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}
interface Storm{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

