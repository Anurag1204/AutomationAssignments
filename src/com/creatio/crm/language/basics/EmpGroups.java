package com.creatio.crm.language.basics;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = new String[3];
		int[] ids = new int[3];
		
		Employees obj = new Employees();
		names[0] = obj.Employee_names1;
		names[1] = obj.Employee_names2;
		names[2] = obj.Employee_names3;
		
		ids[0]= obj.employee_id1;
		ids[1] = obj.employee_id2;
		ids[2]= obj.employee_id3;
		
		System.out.println("Employee Name:" + names[0] +"," + "Employee ID:" + ids[0]);
		System.out.println("Employee Name:" + names[1] +"," + "Employee ID:" + ids[1]);
		System.out.println("Employee Name:" + names[2] +"," + "Employee ID:" + ids[2]);
		

	}

}
