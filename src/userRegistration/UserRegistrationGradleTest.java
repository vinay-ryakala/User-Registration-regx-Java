package com.gradle;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationGradleTest {
    @Test
    public void testFirstName()
    {
        try
        {
            try
            {
                UserRegistrationGradle add = new UserRegistrationGradle();
                boolean output = add.checkName("Vinay");
                Assert.assertTrue(output);
            } catch (NullPointerException e)
            {
                e.printStackTrace();
            }
        }
        catch (InvalidInputException e)

        {
            e.printStackTrace();
        }
    }

    @Test
    public void testLastName()
    {
        try
        {
            try
            {
                UserRegistrationGradle lastName = new UserRegistrationGradle();
                boolean output = lastName.checkName("Rajahs");
                Assert.assertTrue(output);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testEmailId()
    {
      try
       {    try
            {
                UserRegistrationGradle newEmail = new UserRegistrationGradle();
                boolean output = newEmail.email("abc1234@gmail.com");
                Assert.assertTrue(output);
            }
            catch (NullPointerException e)
             {
                e.printStackTrace();
             }
       }
       catch(InvalidInputException e)
       {
           e.printStackTrace();
       }
    }

	@Test
	public void testMobile()
	{
	    try
       {    try
            {
                UserRegistrationGradle phoneNumber = new UserRegistrationGradle();
                boolean output = phoneNumber.mobileNumber("91 1204356789");
                Assert.assertTrue(output);
            }
             catch (NullPointerException e)
             {
                e.printStackTrace();
             }
       }
       catch(InvalidInputException e)
       {
           e.printStackTrace();
       }
	}

    @Test
    public void testPassword()
    {
       try
       {    try
            {
                UserRegistrationGradle passWord = new UserRegistrationGradle();
               boolean output = passWord.password("1A2xC@1asB");
               Assert. assertTrue(output);
            }
             catch (NullPointerException e)
             {
                e.printStackTrace();
             }
       }
       catch(InvalidInputException e)
       {
           e.printStackTrace();
       }
    }

}
