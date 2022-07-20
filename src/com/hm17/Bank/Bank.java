package com.hm17.Bank;

import java.util.Scanner;


public class Bank {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		
		showWelcomeMessage();
	}
	
	private static void showWelcomeMessage() {
		char option = '\0';
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the Bank! Please login or sign up.");
		
		do {
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("A. Login");
			System.out.println("B. Sign Up");
			System.out.println("C. Exit");
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
				case 'A': 
					showLogin();
					break;
				case 'B':
					signUp();
					break;
				case 'C':
					break;
				default:
					System.out.println("Error: invalid option. Please enter A, B, or C");
					break;
			}
		} while(option != 'C');
		
	}
	
	private static void showLogin() {
		System.out.println("Welcome, please login with your customer ID.");
		System.out.println();
		String customerID = scanner.next();
		
		// TODO: Check if customerID exists in DB
		
		Account hazel = new Account("Hazel M", "10000");
		hazel.showMenu();
	}
	
	private static void signUp() {
		System.out.println("Please create a customer account with your name:");
		System.out.println();
		String customerName = scanner.next();
		// TODO: save customer to DB and return customer ID
		String customerID = "testID";
		System.out.println();
		System.out.println("Congrats! Your customer ID is: " + customerID);
		
	}
}
