package userRegistration;


public class UserRegistration 
{
	public static void main(String[] args) 
	{	
		System.out.println("Validation of user entries in UserRegistration");
		UserReg reg=new UserReg(); 
		EmailVaildation checkEmail = new EmailVaildation();
		MobileNumber checkMobile = new MobileNumber();
		PassWord checkPassWord = new PassWord();
		reg.validateFirstname();
		reg.validateLastname();
		checkEmail.validateEmail();
		checkMobile.validateMobile();
		checkPassWord.validatePassWord();
	}
	
}
