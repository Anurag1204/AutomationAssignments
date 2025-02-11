package com.creatio.crm.language.basics;

public class LargestSmallestInArray {

	public static void main(String[] args) {
		
		int[] arr = {10,20,70,50,40};
		
		// largest number in array
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
		// smallest in array
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
