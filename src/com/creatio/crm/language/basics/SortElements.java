package com.creatio.crm.language.basics;

public class SortElements {

	public static void main(String[] args) {
		
		int[] arr1 = {5,2,8,7,1};
		int temp;
		
		// sort the array in ascending order
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i] > arr1[j]) {
					temp = arr1[j];
					arr1[j]=arr1[i];
					arr1[i]=temp;
				}
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

	}

}
