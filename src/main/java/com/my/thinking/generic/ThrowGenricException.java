package com.my.thinking.generic;

import java.util.List;

interface Processor<T,E extends Exception>{
	void process(List<T> resultCollector) throws E; 
}


public class ThrowGenricException {

	
}
