package userRegistration;

import java.util.Scanner;

public class MobileNumber 
{
	private static Scanner input;
	String phoneRegex = "^[0-9]{2}\s[0-9]{10}$";
	
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
				System.out.println(mobileNumber+" is Mobile Number");
			}
			else  
			{
				System.out.println(mobileNumber+" is InValid Mobile Number");
			}
		}
	}
}