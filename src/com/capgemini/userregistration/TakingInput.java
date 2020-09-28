package com.capgemini.userregistration;


import java.util.Scanner;

public class TakingInput {
	private static String email;

	static String read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		email = scan.nextLine();
		return email;
	}
}
