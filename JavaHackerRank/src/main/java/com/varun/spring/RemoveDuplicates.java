package com.varun.spring;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s = "Sam went went to to to his business";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i].equalsIgnoreCase(arr[j])){
					arr[j] = "";
				}
			}
		}
		List<String> listWithoutDuplicate = new ArrayList();
		
		for (String string : arr) {
			if(!string.equals("")){
				listWithoutDuplicate.add(string);
			}
		}
		System.out.println(listWithoutDuplicate);
		for (int i = 0; i < listWithoutDuplicate.size(); i++) {
			if(i == listWithoutDuplicate.size() - 1){
				System.out.print(listWithoutDuplicate.get(i));
				continue;
			}
			System.out.print(listWithoutDuplicate.get(i) + " ");
		}
		System.out.println();
	}
}
