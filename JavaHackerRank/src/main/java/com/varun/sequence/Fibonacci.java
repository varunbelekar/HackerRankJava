package com.varun.sequence;

import com.varun.interfaces.Sequence;

public class Fibonacci implements Sequence {
	int a = 1, b = 1, c = 0, counter = 1;
	
	public int next() {
		if(counter <= 2){
			counter++;
			return 1;
		}
		c = a + b;
		a = b;
		b = c;
		return c;
	}

}
