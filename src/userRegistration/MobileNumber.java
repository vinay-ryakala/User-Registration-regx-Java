package userRegistration;

import java.util.Scanner;

public class MobileNumber 
{
	private static Scanner input;
	String phoneRegex = "^[0-9]{2}\s[1-9]{1}[0-9]{9}$";
	
	public void validateMobile() 
	{	
		input = new Scanner(System.in);
		int i=0;
		while(i<1) 
		{
			System.out.println("Enter mobile Number");
			String mobileNumber=input.nextLine();
			if (mobileNumber.matches(phoneRegex)) 
			{
				i=1;
				System.out.println(mobileNumber+" is valid Mobile Number");
			}
			else  
			{
				System.out.println(mobileNumber+" is InValid Mobile Number");
			}
		}
	}
}