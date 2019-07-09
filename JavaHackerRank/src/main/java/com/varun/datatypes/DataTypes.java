package com.varun.datatypes;

public class DataTypes {
	public static void main(String[] args) {
		long  x = 15;
		System.out.println(x +" cax fit in");
		System.out.print((x >= Byte.MIN_VALUE && x<= Byte.MAX_VALUE) ? "* byte\n" : "");
		System.out.print((x >= Short.MIN_VALUE && x<=Short.MAX_VALUE) ? "* short\n" : "");
		System.out.print((x >= Integer.MIN_VALUE && x<=Integer.MAX_VALUE) ? "* int\n" : "");
		System.out.print((x >= Long.MIN_VALUE && x<=Long.MAX_VALUE) ? "* long\n" : "");
		 
	}
}
