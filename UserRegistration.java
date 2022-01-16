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
				System.out.println("Last Name is invalid...Please enter proper last name");
				System.exit(0);
			}
			return Pattern.matches(LAST_NAME_REGEX, lastName);
		}
		

}	