package com.creatio.crm.language.basics;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		int[] arr = { 2, 10, 10, 100, 2, 10, 11, 2, 11, 2 };
		boolean flag = false;

		Set<Integer> set = new HashSet<Integer>();

		for (int i : arr) {
			if (set.add(i) == false) {
				flag = true;
				System.out.println("Duplicate element is " + i);
				
			}

		}

		if (flag == false) {
			System.out.println("No duplicate element found");
		}

	}

}
