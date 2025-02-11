package com.creatio.crm.language.basics;

public class SearchElement {

	public static void main(String[] args) {
		
		int[] arr = {5,6,7,8,9,10};
		
		int n = 10;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n) {
				System.out.println("Element matched successfully");
				return;
			}
		}
		
		System.out.println("element not matched successfully");

	}

}
