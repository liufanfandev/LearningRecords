package com.my.pattern.create.factory;

public class HumanFactory extends AbstarctHumanFactory {

	@Override
	public <T extends Human> T getHuman(Class<T> c) {
		Human human = null;
		try {
			human = (T)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return (T)human;
	}

}
