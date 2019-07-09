package com.varun.input;

import java.util.Scanner;

public class InputOutputFormatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double d = sc.nextDouble();
		String s = sc.next();

		System.out.println(a + " " + d + " " + s);
	}
}
