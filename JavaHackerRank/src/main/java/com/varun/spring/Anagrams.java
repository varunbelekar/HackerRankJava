package com.varun.spring;

public class Anagrams {

	public static boolean isAnagram(String a, String b) {
		// Complete the function
		if (a.length() != b.length()) {
			return false;
		}
		a = a.toLowerCase();
		b = b.toLowerCase();
		int[] a1 = new int[26];
		int[] b1 = new int[26];
		for (int i = 0; i < a.length(); i++) {
			a1[(int) a.charAt(i) - 97]++;
			b1[(int) b.charAt(i) - 97]++;
		}
		for (int i = 0; i < b1.length; i++) {
			if(a1[i] != b1[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "margana";

		System.out.println((int) s1.charAt(2));
	}
}
