package com.greatlearning.emailgen.services;

public class CredentialService {

	public String GeneratePassword()
	{

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789"
				+ "abcdefghijklmnopqrstuvxyz"
				+"!#@$%^&_+-=*";

		// create StringBuffer size of AlphaNumericString
		int n = 8;
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericSymbolicString variable length
			int index = (int)(AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}
		System.out.println("Password  --> "+sb.toString());
	return sb.toString();
	}

	public String GenerateEmailAddress(String fn, String ln,String department) {

		String Email = fn.toLowerCase()+ln.toLowerCase()+"@"+department+".abc.com";
		System.out.println("Email  --> "+Email);
		return Email;

	}

}