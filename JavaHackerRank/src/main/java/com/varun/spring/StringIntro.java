package com.varun.spring;

public class StringIntro {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "java";
		System.out.println(s1.length() + s2.length());
		System.out.println(s1.compareTo(s2) > 0 ? "Yes" : "No");
		System.out.print(s1.substring(0, 1).toUpperCase() + "" + s1.substring(1, s1.length()));
		System.out.print(" "+s2.substring(0, 1).toUpperCase() + ""+s2.subSequence(1, s2.length()));

	}
}
