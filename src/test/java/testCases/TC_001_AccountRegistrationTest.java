package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass
{

	
	
	@Test(groups= {"Regression","Master"})
	void test_account_registration() throws InterruptedException
	{
		logger.info("******** Starting C_001_AccountRegistrationTest ***** ");
	 
		try
		{
			HomePage hp = new HomePage(driver);
			
			hp.clickMyAccount();
			logger.info("Clicked on My account ");
			
			hp.clickRegister();
			logger.info("Clicked on My account ");
			
			AccountRegistrationPage registrationPage = new AccountRegistrationPage(driver);
			
			logger.info("Providing Customer Data ");
			
			registrationPage.setFirstName(randomeString().toUpperCase());
			 
			registrationPage.setLastName(randomeString().toUpperCase());
			
		    registrationPage.setEmail(randomeString()+"@gmail.com");//randomly generated mail 
			
			//registrationPage.setTelephone("registrationPage");
			
			
			String password = randomAlphaNumeric(); 
			
			registrationPage.setPassword(password);
			//registrationPage.setConfirmPassword(password);
			
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,700);");
			Thread.sleep(500);
		//	registrationPage.setPrivacyPolicy();
			
			
			registrationPage.clickContinue();
			logger.info("Clicked on Continue");
			
			
			registrationPage.getConfirmationMsg();
			logger.info("validating expected message");
			
			
	}
	 catch(Exception e)
	 {
		 logger.error("Test Failed");
		 Assert.fail();
	 }
	 
	 
		logger.info("******** Finished C_001_AccountRegistrationTest ***** ");
	}
	
}
	
	
	

