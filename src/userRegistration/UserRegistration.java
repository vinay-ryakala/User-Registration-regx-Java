package userRegistration;


public class UserRegistration 
{
	public static void main(String[] args) 
	{	
		System.out.println("Validation of user entries in UserRegistration");
		Validation reg=new Validation(); 
		EmailVaildation checkEmail = new EmailVaildation();
		MobileNumber checkMobile = new MobileNumber();
		reg.validateFirstname();
		reg.validateLastname();
		checkEmail.validateEmail();
		checkMobile.validateMobile();
	}
	
}
