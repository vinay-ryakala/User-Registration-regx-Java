package userRegistration;

import java.util.Scanner;

public class Validation 
{
	private static Scanner input;
	String nameRegex = "^[A-Z]{1}[A-Za-z]{2,}$";
	
	public void validateFirstname() 
	{	
		input = new Scanner(System.in);
		int i=0;
		while(i<1) 
		{
			System.out.println("Enter first name");
			String firstName=input.nextLine();
			if (firstName.matches(nameRegex)) 
			{
				i=1;
				System.out.println(firstName +" is Valid name");
			}
			else  
			{
				System.out.println(firstName+" is InValid name");
			}
		}
	}
	public void validateLastname() 
	{	
		input = new Scanner(System.in);
		int i=0;
		while(i<1) 
		{
			System.out.println("Enter last name");
			String lastName=input.nextLine();
			if (lastName.matches(nameRegex)) 
			{
				i=1;
				System.out.println(lastName +" is Valid name");
			}
			else  
			{
				System.out.println(lastName+" is InValid name");
			}
		}
	}
}


