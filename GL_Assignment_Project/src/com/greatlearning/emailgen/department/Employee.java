package com.greatlearning.emailgen.department;

import com.greatlearning.emailgen.services.CredentialService;


public class Employee {

	String firstName;
	String lastName;
	String department;
	CredentialService CS = new CredentialService();

	String PassGenerated;
	String EmailGenerated;
	int Dept;

	public void showCredentials(String fn, String ln, int opt) {
		firstName = fn;
		lastName = ln;
		Dept = opt;


		switch(Dept){
		case 1 :{
			System.out.println("Dear "+fn+" your generated credentials are as follows");
			EmailGenerated = CS.GenerateEmailAddress(fn,ln,"tech");
			PassGenerated = CS.GeneratePassword();
			break;

		}
		case 2 :{
			System.out.println("Dear "+fn+" your generated credentials are as follows");
			EmailGenerated = CS.GenerateEmailAddress(fn,ln,"admin");
			PassGenerated = CS.GeneratePassword();	
			break;
		}
		case 3 :{
			System.out.println("Dear "+fn+" your generated credentials are as follows");
			EmailGenerated = CS.GenerateEmailAddress(fn,ln,"hr");
			PassGenerated = CS.GeneratePassword();	
			break;
		}
		case 4 :{
			System.out.println("Dear "+fn+" your generated credentials are as follows");
			EmailGenerated = CS.GenerateEmailAddress(fn,ln,"legal");
			PassGenerated = CS.GeneratePassword();	
			break;
		}
		default :{
			System.out.println("Dear "+fn+" Not Valid Department hence no Credentials Generated");

		}
		}




	}


}
