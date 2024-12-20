package com.creatio.crm.language.basics;

import java.util.Arrays;

public class Assignment_datatypes {
	
	public static void main(String[] args) {
		
		// 1. Storing the decimal value in temperature variable of double Datatype.
		double temperature = 25.5;
		System.out.println(temperature);
		
		// 2. Storing the outcome of placed_order variable in boolean datatype
		boolean placed_order = true;
		System.out.println(placed_order);
		
		// 3. Storing the phone_number in String datatype because this phone number contains hyphens
		String phone_number = "123-456-7890";
		System.out.println(phone_number);
		
		//4. Storing money variable value in double datatype because it contains decimals
		double money = 1000.50;
		System.out.println(money);
		
		//5. Storing email in String datatype because it is sequence of characters.
		String email= "john.doe@example.com";
		System.out.println(email);
		
		//6. Storing the location coordinates in double[] array and converting it to String to print
		double[] location = {37.7749, -122.4194};
		System.out.println(Arrays.toString(location));
		
		//7. Storing the outcome of marital_status variable in boolean datatype
		boolean marital_status = true;
		System.out.println(marital_status);
		
		//8. Storing occupation in String datatype because it is sequence of characters.
		String occupation = "Software Engineer";
		System.out.println(occupation);
		
		//9. Storing color in String datatype because it is sequence of characters.
		String colour = "Blue";
		System.out.println(colour);
		
		//10.Storing the value of current year in integer datatype
		int current_year = 2023;
		System.out.println(current_year);
		
		//11. Storing the number_of_followers in String datatype because this number_of_followers contains commas
		String number_of_followers = "1,00,000";
		System.out.println(number_of_followers);
		
		//12.Storing rating of a movie in float datatype
		float rating = 7.5f;
		System.out.println(rating);
		
		//13.Storing blood type of a person as char datatype
		char blood_type = 'A';
		System.out.println(blood_type);
		
		//14.Storing the Title of a book in String datatype because it contains sequence of characters
		String Title = "To Kill a Mockingbird";
		System.out.println(Title);
		
		//15. Storing the number_of_employees in integer datatype
		int number_of_employees = 500;
		System.out.println(number_of_employees);
		
		//16. Storing the time in String datatype because time contains PM
		String time = "2:30 PM";
		System.out.println(time);
		
		//17. Storing the Country in String datatype because it contains sequence of characters. 
		String Country = "United States";
		System.out.println(Country);
		
		//18. Storing the eye_color in String datatype because it contains sequence of characters. 
		String eye_color = "Brown";
		System.out.println(eye_color);
		
		//19. Storing the birthplace in String datatype because it contains sequence of characters.
		String birthplace = "New York City";
		System.out.println(birthplace);
		
		//20. Storing value of distance variable in float datatype because it contains decimals.
		float distance = 200.5f;
		System.out.println(distance);
		

	}

}
