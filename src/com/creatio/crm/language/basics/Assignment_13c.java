package com.creatio.crm.language.basics;

public class Assignment_13c {

	public static void main(String[] args) {

		int n = 5;

		// for rows
		for (int i = 0; i < n; i++) {
			// for spaces
			for (int j = 1; j < 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// print stars

			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
