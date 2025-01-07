package com.creatio.crm.language.basics;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentGrades {
	
	Map <String,Character> lhmap = new LinkedHashMap<String,Character>();

    public void addNewStudentGrade(String name, char grade){
        System.out.println("List of the students getting added are");
        lhmap.put(name,grade);
        System.out.println(lhmap);

    }

    public void removeStudentGrade(String name){
        System.out.println("After removing " + name + " list is as follows");
        lhmap.remove(name);
        System.out.println(lhmap);

    }

    public void viewStudentGrade(String name){
        System.out.println("Grade of "+ name + " is--> "+ lhmap.get(name));

    }
}


