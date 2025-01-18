package com.creatio.crm.language.basics;

public class Assignment_13a {

	public static void main(String[] args) {

		String sentence = "Java Programming is fun and challenging";

		// Count the total number of words in the sentence.
		String[] strarray = sentence.split(" ");
		System.out.println("Total Number of words in a sentence is: " + strarray.length);

		// Print the sentence words in reverse order.
		StringBuilder revstring = new StringBuilder();
		for (int i = strarray.length - 1; i >= 0; i--) {
			revstring.append(strarray[i]);
			revstring.append(" ");

		}
		System.out.println("Reverse string is as follows: " + revstring);

		/*
		 * Convert the first character of each word to uppercase and print original
		 * sentence
		 */

		for (int i = 0; i < strarray.length; i++) {
			char a = strarray[i].charAt(0);
			String abc = String.valueOf(a).toUpperCase();

			String xyz = strarray[i].substring(1);
			System.out.print(abc + xyz + " ");

		}

	}

}
