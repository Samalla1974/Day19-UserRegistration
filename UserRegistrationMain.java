package com.bridgelabz.userregistration;
import java.util.Scanner;

	public class UserRegistrationMain {
		public static void main(String[] args) {
			UserRegistration registration = new UserRegistration();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Name: ");
			String firstName = sc.next();
			registration.validateFirstName(firstName);
			
		}

	}

