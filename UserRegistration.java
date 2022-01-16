package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	private static final String PHONE_NUMBER_REGEX = "^[0-9]{2}[0-9]{10}";
	private static final String PASSWORD_REGEX = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
	static boolean isFirstNameValid,isLastNameValid,isMailValid,isNumberValid,isPasswordValid;
	
	public boolean validateFirstName(String firstName) {
		isFirstNameValid= Pattern.matches(FIRST_NAME_REGEX,firstName);
		if(!isFirstNameValid) {
			System.out.println("First Name is invalid");
		}
		return isFirstNameValid;
	}
		public boolean validateLastName(String lastName) {
			isLastNameValid= Pattern.matches(LAST_NAME_REGEX, lastName);
			if(!isLastNameValid) {
				System.out.println("Please enter valid Last Name");
				System.exit(0);
			}
			return Pattern.matches(LAST_NAME_REGEX, lastName);
		}
		
		public boolean validateEmail(String email) {
			isMailValid= Pattern.matches(EMAIL_REGEX, email);
			if(!isMailValid) {
				System.out.println("Please enter valid e-mail");
				System.exit(0);
			}
			return Pattern.matches(EMAIL_REGEX, email);
		}
		public boolean validatePhoneNumber(String phoneNumber) {
			isNumberValid= Pattern.matches(PHONE_NUMBER_REGEX, phoneNumber);
			if(!isNumberValid) {
				System.out.println("Please enter valid phone-number");
				System.exit(0);
			}
			return Pattern.matches(PHONE_NUMBER_REGEX, phoneNumber);
		}
		public boolean validatePassword(String password) {
			isPasswordValid= Pattern.matches(PASSWORD_REGEX, password);
			if(!isPasswordValid) {
				System.out.println("Please enter a valid  password");
				System.exit(0);
			}
			return Pattern.matches(PASSWORD_REGEX, password);
		}			

		public void register() {
			if(isFirstNameValid && isLastNameValid && isMailValid && isNumberValid & isPasswordValid) {
				System.out.println("You are registered!!!");
				System.out.println("Welcome");
			}
		}
}	