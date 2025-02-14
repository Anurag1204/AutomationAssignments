package com.creatio.crm.language.basics;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		
		int[] arr = { 12, 34, 11, 36, 87, 98, 93 };
		
		int size = arr.length;
		int temp;
		
		// sort the array in descending order
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Second smallest number is " + arr[size-2]);

	}

}
