package com.creatio.crm.language.basics;

public class Second_third_largest_number {

	public static void main(String[] args) {

		int[] arr = { 12, 34, 11, 36, 87, 98, 93 };

		int temp = 0;
		int size = arr.length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}

		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
		// 11 12 34 36 87 93 98
		
		System.out.println("Second largest number is " + arr[size - 2]);
		System.out.println("Second largest number is " + arr[size - 3]);
		
		

	}
}
