package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment_5 {

	public static void main(String[] args) {

		/*
		 * Q1. Create a list of the top 5 most populated countries in the world and
		 * print 2nd Country
		 */

		List<String> countrylist = new ArrayList<String>();

		// Add all the countries in ArrayList
		countrylist.add("India");
		countrylist.add("China");
		countrylist.add("United States");
		countrylist.add("Indonesia");
		countrylist.add("Pakistan");

		// Getting 2nd most populated country in the world
		String second_country = countrylist.get(1);
		System.out.println("Second most populated country is ==> " + second_country);

		/*
		 * Q2. Create a set of the top 10 most visited tourist attractions in the world
		 * and print out its size.
		 */

		// Adding all the places in Hashset
		Set<String> places_list = new HashSet<String>();
		places_list.add("The Forbidden City,China");
		places_list.add("The Taj Mahal,India");
		places_list.add("The Colosseum,Italy");
		places_list.add("The Eiffel Tower,Paris");
		places_list.add("The Egyptian pyramids,Egypt");
		places_list.add("Bangkok,Thailand");
		places_list.add("London, England");
		places_list.add("Dubai, United Arab Emirates");
		places_list.add("Singapore");
		places_list.add("New York City, USA");

		// Storing the size of hashset in a variable and printing it
		int number_of_places = places_list.size();
		System.out.println("Total number of places are ==> " + number_of_places);

		/*
		 * 3. Create a map of the 5 largest cities in the United States and their
		 * populations.
		 */

		// Adding all the cities and their population in a hashmap
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("New York City", 8804190);
		hmap.put("Los Angeles", 8804190);
		hmap.put("Chicago", 2746388);
		hmap.put("Houston", 2304580);
		hmap.put("Phoenix", 1608139);

		System.out.println("Five largest cities are ==> " + hmap);

		/*
		 * 4. Create an array of 10 random integers and print out the sum of 3rd and 5th
		 * Value.
		 */

		int[] numbers = { 761, 614, 441, 470, 539, 608, 141, 914, 78, 415 };
		int sum = numbers[2] + numbers[4];
		System.out.println("Sum of third and fifth value is ==> " + sum);

		/*
		 * 5. Create a list of the top 5 highest-grossing movies of all time and print
		 * out the third movie on the list.
		 */

		// Add all the movies in ArrayList
		List<String> movieslist = new ArrayList<String>();
		movieslist.add("Avatar");
		movieslist.add("Avengers: Endgame");
		movieslist.add("Avatar: The Way of Water");
		movieslist.add("Titanic");
		movieslist.add("Spider-Man: No Way Home");

		// Printing third highest grossing movie on the list
		String movie = movieslist.get(2);
		System.out.println("Third highest grossing movies of all time is ==> " + movie);

	}

}
