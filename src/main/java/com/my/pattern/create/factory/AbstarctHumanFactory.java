package com.my.pattern.create.factory;

public abstract class AbstarctHumanFactory {
	public abstract <T extends Human> T getHuman(Class<T> c);
}
