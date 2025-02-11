package com.creatio.crm.language.basics;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 1 2 3 5 8 13 21 34

		int a = 0;
		int b = 1;
		int sum;
		int k = 1;

		while (k < 10) {
			sum = a + b;
			System.out.println(sum);
			a=b;
			b=sum;
			k++;
			
		}
		

	}

}
