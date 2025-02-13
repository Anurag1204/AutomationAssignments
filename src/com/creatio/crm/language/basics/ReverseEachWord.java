package com.creatio.crm.language.basics;

public class ReverseEachWord {

	public static void main(String[] args) {

		String[] str = "My name is Anurag Singh".split(" ");

		StringBuffer rev = new StringBuffer();

		for (int i = str.length - 1; i >= 0; i--) {
			rev.append(str[i]);
			rev.append(" ");
		}

		System.out.println(rev);

	}

}
