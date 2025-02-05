package com.creatio.crm.language.basics;

public class StudentTest {

	public static void main(String[] args) {

		StudentGrades obj = new StudentGrades();

		obj.addNewStudentGrade("Anurag", 'A');
		obj.addNewStudentGrade("Bob", 'B');
		obj.addNewStudentGrade("Charlie", 'C');

		obj.removeStudentGrade("Anurag");

		obj.viewStudentGrade("Bob");

	}

}
