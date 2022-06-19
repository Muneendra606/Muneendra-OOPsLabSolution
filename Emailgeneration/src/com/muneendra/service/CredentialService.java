package com.muneendra.service;

import java.util.Random;

public class CredentialService {
public char[] generatePassword() {
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "012345689";
	String specialCharacters = "!@#$%^&*_=+-/.?<>";
	
	String values = capitalLetters + smallLetters + specialCharacters;
	Random random = new Random ();
	char [] password = new char [8];
	for (int i=0; i<8; i++) {
		password[i] = values.charAt(random.nextInt(values.length()));
	} 
	return password;
}
public String generateEmailAddress(String firstName, String lastName, String department) {
	return ( firstName + lastName + "@" +department+".abc.com");
}
 public void showCredentials(String firstName, String lastName, String department) {
	System.out.println("Dear"+firstName+ "your generated credentials are as folows");
	System.out.println("Email---->"+ firstName + lastName+"@"+);

	System.out.println("Password---->"+ random.generatepassword);
  }
}
