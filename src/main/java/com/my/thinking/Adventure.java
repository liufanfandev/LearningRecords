package com.my.thinking;

public class Adventure {
	
	public static void test(Hero a){
		a.fight();
	}
	public static void main(String[] args) {
		Hero h = new Hero();
		test(h);
	}
}
class ActionCharacter{
	public void fight(){
		//System.out.println("666");
	}
}
interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}
class Hero extends ActionCharacter implements CanFight,CanSwim{

	@Override
	public void swim() {
		
	}
	
}