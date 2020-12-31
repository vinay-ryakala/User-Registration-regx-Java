package userRegistration;

import java.util.Scanner;

public class EmailVaildation 
{
	private static Scanner input;
	String emailRegex = "^([a-zA-Z0-9]+)([_+.-]{1}[a-z0-9]+)*@([A-Za-z0-9]+).([a-z]{2,4})((.[a-z]{2,3})?)$";
	
	public void validateEmail() 
	{	
		input = new Scanner(System.in);
		int i=0;
		while(i<1) 
		{
			System.out.println("Enter email");
			String email=input.nextLine();
			if (email.matches(emailRegex)) 
			{
				i=1;
				System.out.println(email +" is Valid email");
			}
			else  
			{
				System.out.println(email+" is InValid email");
			}
		}
	}
}
