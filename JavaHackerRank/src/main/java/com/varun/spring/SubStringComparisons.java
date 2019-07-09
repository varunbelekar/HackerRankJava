package com.varun.spring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubStringComparisons {
	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;
		List<String> list = new ArrayList();
		for (int i = 0; i <= s.length() - k; i++) {
			list.add(s.substring(i, i + k));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list.get(0) + " " + list.get(list.size() - 1));
	}
}
