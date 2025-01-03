package com.creatio.crm.language.basics;

import java.util.Scanner;

public class Assignment_Conditionalstatements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer name");
		String customerName = sc.nextLine();
		System.out.println("Enter the creditScore");
		int creditScore = sc.nextInt();
		System.out.println("Enter the income");
		double income = sc.nextDouble();
		System.out.println("Enter the employment status");
		boolean isEmployed = sc.nextBoolean();
		System.out.println("Enter the DTI");
		float debtToIncomeRatio = sc.nextFloat();

		if (creditScore > 750) {
			System.out.println(customerName + " is automatically approved for Loan");

		} else if (creditScore >= 650 && creditScore < 750) {
			if (income >= 50000 && isEmployed == true && debtToIncomeRatio < 40.0) {
				System.out.println(customerName + " is eligible for loan with additional checks");
		}

		} else {
			System.out.println(customerName + " is not eligible for loan");
		}

	}

}
