package com.creatio.crm.language.basics;

public class Assignment_15a {

	public static void main(String[] args) {

		String input = " I Love Dogs ";
		// Removed all the white spaces by using replace method
		String FilteredInput = input.replace(" ", "");

		String word = "";

		for (int i = 0; i < FilteredInput.length(); i++) {
			for (int j = i + 1; j < FilteredInput.length(); j++) {

				char char1 = FilteredInput.charAt(i);
				char char2 = FilteredInput.charAt(j);
				
				if(char1!= char2) {
					System.out.println(FilteredInput.valueOf(char1) + FilteredInput.valueOf(char2));
					System.out.println(FilteredInput.valueOf(char2) + FilteredInput.valueOf(char1));
				}

			}
		}
		

	}

}
