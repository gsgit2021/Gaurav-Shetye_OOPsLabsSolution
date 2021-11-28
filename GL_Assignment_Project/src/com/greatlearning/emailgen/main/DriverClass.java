package com.greatlearning.emailgen.main;

import java.util.Scanner;

import com.greatlearning.emailgen.department.Employee;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee Emp = new Employee();
		Scanner SC = new Scanner(System.in);
		String FirstName;
		String LastName;

		System.out.println("Welcome to the employee email Creation Utility");
		System.out.println();
		System.out.println("Enter your First Name");
		FirstName = SC.nextLine();
		System.out.println("Enter your Last Name");
		LastName = SC.nextLine();

		int option;
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("Please enter department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("-----------------------------------------------");
		option = SC.nextInt();

		Emp.showCredentials(FirstName, LastName, option);

		SC.close();

	}
}
