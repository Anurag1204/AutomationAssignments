package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment_6 {

	public static void main(String[] args) {

		List<Integer> list_of_transactions = new ArrayList<Integer>();

		list_of_transactions.add(50000);
		list_of_transactions.add(-2000);
		list_of_transactions.add(3000);
		list_of_transactions.add(-15000);
		list_of_transactions.add(-200);
		list_of_transactions.add(-300);
		list_of_transactions.add(4000);
		list_of_transactions.add(-3000);

		// 1. Print total number of credit and debit transactions completed

		int count_credit = 0;
		int count_debit = 0;
		for (int i : list_of_transactions) {
			if (i > 0) {
				count_credit++;
			} else {
				count_debit++;
			}

		}
		System.out.println("Total number of credit statements -->" + count_credit);
		System.out.println("Total number of debit statements -->" + count_debit);

		// 2.Print the total amount credited and debited in account

		int amount_credited = 0;
		int amount_debited = 0;
		for (int i : list_of_transactions) {

			if (i > 0) {

				amount_credited = i + amount_credited;

			} else {
				amount_debited = i + amount_debited;
			}

		}
		System.out.println("Total amount credited in account :" + amount_credited);
		System.out.println("Total amount debited in account :" + amount_debited);

		// 3. Print total amount remaining at the end in Bank Account
		int remaining_amount = amount_debited + amount_credited;

		System.out.println("Total Remaining amount in bank account --> " + remaining_amount);

		/*
		 * 4.If any transaction limit exceeds +/- 10000 then print the message
		 * “Suspicious credit/ debit Transaction with Amount” and also print total
		 * number of suspicious transactions
		 */

		int suspicious_transactions = 0;
		for (int i : list_of_transactions) {
			if (i > 10000 || i < (-10000)) {
				suspicious_transactions++;
				System.out.println("Suspicious credit/ debit Transaction with amount: " + i);

			}
		}
		System.out.println("Number of suspicious transactions :" + suspicious_transactions);

	}

}
