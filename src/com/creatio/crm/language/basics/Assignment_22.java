package com.creatio.crm.language.basics;

import java.util.Arrays;

public class Assignment_22 {

	// String[] str = ["flower","flow","flight"]

	public static String getPrefix(String[] str) {

		
		// Sort the arrays of string
		Arrays.sort(str);

		// find the first and last string after sorting
		String first = str[0];
		String last = str[str.length - 1];
		int min_length = Math.min(first.length(), last.length());

		// find the common prefix between first and last string
		int i = 0;
		
		while(i< min_length && first.charAt(i) != last.charAt(i)) {
			return "empty";
		};
		
		
		while (i < min_length && first.charAt(i) == last.charAt(i)) {
			i++;
		}
		return first.substring(0, i);
		

	}

	public static void main(String[] args) {

		String[] arr1 = { "flower", "flow", "flight" };
		System.out.println(getPrefix(arr1));

		String[] arr2 = { "dog", "racecar", "car" };
		System.out.println(getPrefix(arr2));

	}

}
