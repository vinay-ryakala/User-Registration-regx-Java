package userRegistration;


public class UserRegistration 
{
	public static void main(String[] args) 
	{	
		System.out.println("Validation of user entries in UserRegistration");
		Validation reg=new Validation(); 
		reg.validateFirstname();
		reg.validateLastname();
	}
	
}
