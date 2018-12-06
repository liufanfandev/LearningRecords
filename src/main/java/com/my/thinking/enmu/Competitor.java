package com.my.thinking.enmu;

public interface Competitor<T extends Competitor<T>> {

	Outcome compete(T competitor);
}
