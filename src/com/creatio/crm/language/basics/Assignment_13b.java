package com.creatio.crm.language.basics;

public class Assignment_13b {

	public static void main(String[] args) {

		String paragraph = "Java is a popular programming language. "
				+ "Java is used for web development, mobile applications, and more.";
		int count = 0;

		// Divide into multiple words
		String[] paragrapharray = paragraph.split(" ");

		// Find total number of occurrences of Java

		for (int i = 0; i < paragrapharray.length; i++) {
			if (paragrapharray[i].equals("Java")) {
				System.out.println("Index of the Java keyword is: " + i);
				count++;

			}

		}
		System.out.println("Total number of occurrences of Java: " + count);

	}

}
