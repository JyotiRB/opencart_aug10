package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{

	@Test(groups= {"Sanity","Master"})
	public void test_login()
	{
		
		try
		{
			
		
		logger.info("************ Starting TC_002_LoginTest ****");
		
		HomePage hp= new HomePage(driver);
		
		logger.info(" Clicked on My account ");
		hp.clickMyAccount();
		
		logger.info(" Clicked on login ");
		hp.clickLogin();
		
		
		LoginPage lp = new LoginPage(driver);
		
		logger.info(" Providing login details ");
		
		lp.setEmail(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		
		logger.info(" Clicked on login button ");
		lp.clickLogin();
		
	
		
		 MyAccountPage macc = new MyAccountPage(driver);
		 boolean targetpage = macc.isMyAccountPageExists();	
		 
		 
		 Assert.assertEquals(targetpage, true);
		 
		}
		catch(Exception e)
		{
			Assert.fail();
		}
				
		logger.info("************ Finished TC_002_LoginTest ****");
	}
	
				
	
}
