package com.capgemini.userregistration;

import java.util.Scanner;

public class TakingInput {
	static Scanner scan = new Scanner(System.in);

	static String firstName() {
		System.out.println("Enter Your First name");
		String firstName;
		firstName = scan.nextLine();
		return firstName;
	}

	static String lastName() {
		System.out.println("Enter Your last name");
		String lastName;
		lastName = scan.nextLine();
		return lastName;
	}
}
