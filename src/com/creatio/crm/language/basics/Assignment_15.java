package com.creatio.crm.language.basics;

public class Assignment_15 {

	String str;

	public void checkPalindrome(String input) {

		str = input;

		// Step 1 : Replace all the non-alphanumeric characters and convert to lowercase
		String FilteredInput = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		// Check whether string is palindrome or not, we will use reverse concept
		String reverse = "";
		for (int i = FilteredInput.length() - 1; i >= 0; i--) {
			reverse = reverse + FilteredInput.charAt(i);
		}

		if (reverse.equals(FilteredInput)) {
			System.out.println(FilteredInput + " is a palindrome sequence");
		} else
			System.out.println(FilteredInput + " is not a palindrome sequence");

	}

	public static void main(String[] args) {

		Assignment_15 check = new Assignment_15();
		check.checkPalindrome("A man, a plan,a canal: Panama");
		check.checkPalindrome("race a car");

	}

}
