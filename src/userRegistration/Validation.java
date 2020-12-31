package userRegistration;

import java.util.Scanner;

public class Validation 
{
	private static Scanner input;
	
	public void validateFirstname() 
	{	
		input = new Scanner(System.in);
		
		String regex = "^[A-Z]{1}[A-Za-z]{2,}$";
		int i=1;
		while(i>0) 
		{
			System.out.println("Enter firstname");
			String firstName=input.nextLine();
			if (firstName.matches(regex)) 
			{
			i=-1;
			System.out.println(firstName +" is Valid name");
			}
			else  
			{
			System.out.println(firstName+" is InValid name");
			}
		}
	}
}


