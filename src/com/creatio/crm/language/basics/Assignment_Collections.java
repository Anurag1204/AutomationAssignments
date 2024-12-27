package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment_Collections {

	public static void main(String[] args) {

		// Adding details of 1st student in form of hashmap and storing all the values

		Map<String, String> hmapstudent1 = new HashMap<String, String>();
		hmapstudent1.put("Name", "John Doe");
		hmapstudent1.put("Age", "20");
		hmapstudent1.put("Gender", "Male");
		hmapstudent1.put("Roll Number", "$12345");
		hmapstudent1.put("Grade", "A");
		hmapstudent1.put("Major", "Computer Science");
		hmapstudent1.put("GPA", "3.8");
		hmapstudent1.put("Email", "john@example.com");
		hmapstudent1.put("Contact Number", "9999997777");
		hmapstudent1.put("Address", "123 Elm St");

		// Adding details of 2nd student in form of hashmap and storing all the values

		Map<String, String> hmapstudent2 = new HashMap<String, String>();
		hmapstudent2.put("Name", "Jane Smith");
		hmapstudent2.put("Age", "21");
		hmapstudent2.put("Gender", "Female");
		hmapstudent2.put("Roll Number", "$12346");
		hmapstudent2.put("Grade", "B");
		hmapstudent2.put("Major", "Mathematics");
		hmapstudent2.put("GPA", "3.5");
		hmapstudent2.put("Email", "jane@example.com");
		hmapstudent2.put("Contact Number", "9876665666");
		hmapstudent2.put("Address", "456 Oak St");

		// Adding details of 2nd student in form of hashmap and storing all the values

		Map<String, String> hmapstudent3 = new HashMap<String, String>();
		hmapstudent3.put("Name", "Mike Brown");
		hmapstudent3.put("Age", "22");
		hmapstudent3.put("Gender", "Male");
		hmapstudent3.put("Roll Number", "$12347");
		hmapstudent3.put("Grade", "A");
		hmapstudent3.put("Major", "Mathematics");
		hmapstudent3.put("GPA", "3.9");
		hmapstudent3.put("Email", "mike@example.com");
		hmapstudent3.put("Contact Number", "8787876546");
		hmapstudent3.put("Address", "789 Pine St");

		// Add all the student maps in a single list

		List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
		studentList.add(hmapstudent1);
		studentList.add(hmapstudent2);
		studentList.add(hmapstudent3);

		// Adding details of 1st employee in form of hashmap and storing all the values

		Map<String, String> hmapemp1 = new HashMap<String, String>();
		hmapemp1.put("EmpId", "E001");
		hmapemp1.put("Name", "Alice Green");
		hmapemp1.put("Age", "30");
		hmapemp1.put("Gender", "Female");
		hmapemp1.put("Department", "Engineering");
		hmapemp1.put("Position", "Software Engineer");
		hmapemp1.put("Salary", "75000");
		hmapemp1.put("Email", "alice@example.com");
		hmapemp1.put("Contact Number", "9876543213");

		// Adding details of 2nd employee in form of hashmap and storing all the values

		Map<String, String> hmapemp2 = new HashMap<String, String>();
		hmapemp2.put("EmpId", "E002");
		hmapemp2.put("Name", "Bob Johnson");
		hmapemp2.put("Age", "35");
		hmapemp2.put("Gender", "Male");
		hmapemp2.put("Department", "Marketing");
		hmapemp2.put("Position", "Marketing Manager");
		hmapemp2.put("Salary", "85000");
		hmapemp2.put("Email", "bob@example.com");
		hmapemp2.put("Contact Number", "9876543214");

		// Adding details of 3rd employee in form of hashmap and storing all the values

		Map<String, String> hmapemp3 = new HashMap<String, String>();
		hmapemp3.put("EmpId", "E003");
		hmapemp3.put("Name", "Carol White");
		hmapemp3.put("Age", "28");
		hmapemp3.put("Gender", "Female");
		hmapemp3.put("Department", "Sales");
		hmapemp3.put("Position", "Sales Executive");
		hmapemp3.put("Salary", "65000");
		hmapemp3.put("Email", "carol@example.com");
		hmapemp3.put("Contact Number", "9876543215");

		List<Map<String, String>> empList = new ArrayList<Map<String, String>>();
		empList.add(hmapemp1);
		empList.add(hmapemp2);
		empList.add(hmapemp3);

		// Adding details of 1st product in form of hashmap and storing all the values

		Map<String, String> hmapproduct1 = new HashMap<String, String>();
		hmapproduct1.put("ProductId", "P001");
		hmapproduct1.put("Name", "Laptop");
		hmapproduct1.put("Category", "Electronics");
		hmapproduct1.put("Price", "$1200");
		hmapproduct1.put("Stock Quantity", "50");
		hmapproduct1.put("Supplier", "Tech Supplies");
		hmapproduct1.put("Warranty", "2 years");
		hmapproduct1.put("Rating", "4.5");
		hmapproduct1.put("Manufacturing Date", "15-01-2023");
		hmapproduct1.put("Expiry Date", "15-01-2025");

		// Adding details of 2nd product in form of hashmap and storing all the values

		Map<String, String> hmapproduct2 = new HashMap<String, String>();
		hmapproduct2.put("ProductId", "P002");
		hmapproduct2.put("Name", "Desk Chair");
		hmapproduct2.put("Category", "Furniture");
		hmapproduct2.put("Price", "$150");
		hmapproduct2.put("Stock Quantity", "200");
		hmapproduct2.put("Supplier", "Office Depot");
		hmapproduct2.put("Warranty", "1 year");
		hmapproduct2.put("Rating", "4");
		hmapproduct2.put("Manufacturing Date", "10-02-2023");
		hmapproduct2.put("Expiry Date", "N/A");

		// Adding details of 3rd product in form of hashmap and storing all the values
		Map<String, String> hmapproduct3 = new HashMap<String, String>();
		hmapproduct3.put("ProductId", "P003");
		hmapproduct3.put("Name", "Coffee Maker");
		hmapproduct3.put("Category", "Kitchen");
		hmapproduct3.put("Price", "$75");
		hmapproduct3.put("Stock Quantity", "100");
		hmapproduct3.put("Supplier", "KitchenWorld");
		hmapproduct3.put("Warranty", "6 months");
		hmapproduct3.put("Rating", "4.2");
		hmapproduct3.put("Manufacturing Date", "20-03-2023");
		hmapproduct3.put("Expiry Date", "20-03-2024");

		List<Map<String, String>> prodList = new ArrayList<Map<String, String>>();
		prodList.add(hmapproduct1);
		prodList.add(hmapproduct2);
		prodList.add(hmapproduct3);

		// Put all the 3 list in a single map to store the data
		Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
		data.put("StudentList", studentList);
		data.put("EmployeeList", empList);
		data.put("ProductList", prodList);

		String value = data.get("ProductList").get(1).get("Supplier");
		System.out.println(value);

	}

}
