package com.creatio.crm.language.basics;

public class Assignment25 {

	public static void main(String[] args) {

		getPowerValue(2.00000, 10);
		getPowerValue(2.10000, 3);
		getPowerValue(2.00000, -2);

	}

	public static void getPowerValue(double number, int exponent) {

		double value = Math.pow(number, exponent);
		System.out.format("%.5f", value);
		System.out.println();

	}

}
