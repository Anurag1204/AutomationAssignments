package com.creatio.crm.language.basics;

public class SumofElementsInArray {

	public static void main(String[] args) {
		
		
		int[] arr = {10,20,20,10,10,20,5,20};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

	}

}
