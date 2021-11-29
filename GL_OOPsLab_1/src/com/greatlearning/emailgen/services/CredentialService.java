package com.greatlearning.emailgen.services;

import java.util.Random;

public class CredentialService {

	public  char[] GeneratePassword(int length) {

	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      String PWD = String.valueOf(password);
	      System.out.println("Password  --> "+ PWD);
	      return password;
	}

	public String GenerateEmailAddress(String fn, String ln,String department) {

		String Email = fn.toLowerCase()+ln.toLowerCase()+"@"+department+".abc.com";
		System.out.println("Email  --> "+Email);
		return Email;

	}

}