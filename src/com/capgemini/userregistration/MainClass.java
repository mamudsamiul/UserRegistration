package com.capgemini.userregistration;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration");
		String firstName = TakingInput.firstName();
		CheckFormat.check(firstName);
	}
}
