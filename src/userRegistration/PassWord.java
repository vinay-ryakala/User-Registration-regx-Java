package userRegistration;

import java.util.Scanner;

public class PassWord {
	private static Scanner input;
	String passWordRegex = "^[A-Za-z0-9]{8,}$";
	public void validatePassWord() 
	{	
		input = new Scanner(System.in);
		int i=0;
		while(i<1) 
		{
			System.out.println("Enter password");
			String passWord=input.nextLine();
			if (passWord.matches(passWordRegex)) 
			{
				i=1;
				System.out.println(passWord+" is vaild password");
			}
			else  
			{
				System.out.println(passWord+" is InValid password");
			}
		}
	}

}
