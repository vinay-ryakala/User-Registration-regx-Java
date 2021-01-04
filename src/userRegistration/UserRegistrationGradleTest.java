package com.gradle;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationGradleTest {
    @Test
    public void testFirstName() {
        UserRegistrationGradle add = new UserRegistrationGradle();
        boolean output = add.checkName("Vinay");
        Assert.assertTrue(output);
    }
    @Test
    public void testLastName() {
        UserRegistrationGradle lastName = new UserRegistrationGradle();
        boolean output = lastName.checkName("Rajahs");
        Assert.assertTrue(output);
    }
    @Test
    public void testEmailId() {
        UserRegistrationGradle newEmail = new UserRegistrationGradle();
        boolean output = newEmail.email("abc1234@gmail.com");
        Assert.assertTrue(output);
    }

	@Test
	public void testMobile() {
        UserRegistrationGradle phoneNumber = new UserRegistrationGradle();
		boolean output = phoneNumber.mobileNumber("91 1204356789");
		Assert.assertTrue(output);
	}

    @Test
    public void testPassword() {
        UserRegistrationGradle passWord = new UserRegistrationGradle();
       boolean output = passWord.password("1A2xC@1asB");
       Assert. assertTrue(output);
    }
}
