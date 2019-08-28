package com.varun.sequence;

import com.varun.interfaces.Sequence;

public class Test {
	public static void main(String[] args) {
		Sequence sequence = new Fibonacci();
		int n = 12;
		for (int i = 1; i <= n; i++) {
			System.out.println(sequence.next());
		}
		
//		int index = 0, q = 0;
//		while(true){
//			q = sequence.next();
//			index++;
//			if(q > 1000){
//				System.out.println("Index " + index);
//				break;
//			}
//		}
	}
}
