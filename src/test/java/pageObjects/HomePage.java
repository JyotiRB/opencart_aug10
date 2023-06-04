package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage 
{
	
	
	

	//Home page constructor
	public HomePage(WebDriver driver)
	{
		//Invocation parent class constructor 
		super(driver);
	}
	
	
	

	// Elements
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkMyaccount;

	@FindBy(linkText = "Register")
	WebElement lnkRegister;
	
	@FindBy (xpath="//a[contains(text(),'Login')][1]")
	WebElement linkLogin;

	
	
	
	
	
	// Action Methods
	public void clickMyAccount() {
		lnkMyaccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}
	

	public void clickLogin() {
		linkLogin.click();
	}
}
