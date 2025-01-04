package com.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.Map;

public class Assignment_8 {

	String name1 = "Alice Johnson";
	double salary1 = 75000;
	int experience1 = 5;
	double rating1 = 4.2;

	String name2 = "Bob Smith";
	double salary2 = 68000;
	int experience2 = 3;
	double rating2 = 3.8;

	String name3 = "Carol Davis";
	double salary3 = 82000;
	int experience3 = 7;
	double rating3 = 4.5;

	String name4 = "David Brown";
	double salary4 = 90000;
	int experience4 = 10;
	double rating4 = 2;

	String name5 = "Eva Green";
	double salary5 = 60000;
	int experience5 = 2;
	double rating5 = 3.5;

	public static void main(String[] args) {
		
		// Calling calculatehikepercentage method with an object obj.
		calculateHikePercent obj = new calculateHikePercent();

		double hike_percentage_emp1 = obj.calculateHikePercentage(75000, 5, 4.2);

		double hike_percentage_emp2 = obj.calculateHikePercentage(68000, 3, 3.8);

		double hike_percentage_emp3 = obj.calculateHikePercentage(82000, 7, 4.5);

		double hike_percentage_emp4 = obj.calculateHikePercentage(90000, 10, 2);

		double hike_percentage_emp5 = obj.calculateHikePercentage(60000, 2, 3.5);

		// Storing the values in Hashmap

		Map<String, Double> hike_map = new HashMap<String, Double>();

		hike_map.put("Alice Johnson", hike_percentage_emp1);
		hike_map.put("Bob Smith", hike_percentage_emp2);
		hike_map.put("Carol Davis", hike_percentage_emp3);
		hike_map.put("David Brown", hike_percentage_emp4);
		hike_map.put("Eva Green", hike_percentage_emp5);

		// Printing all the values of hashmap with empname and hike%
		System.out.println(hike_map);

	}

}
