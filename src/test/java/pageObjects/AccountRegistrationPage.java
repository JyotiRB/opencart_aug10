package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	// Elements
		@FindBy(name = "firstname")
		WebElement txtFirstname;

		@FindBy(name = "lastname")
		WebElement txtLasttname;

		@FindBy(name = "email")
		WebElement txtEmail;

		//@FindBy(name = "telephone")
		//WebElement txtTelephone;

		@FindBy(name = "password")
		WebElement txtPassword;

		//@FindBy(name = "confirm")
		//WebElement txtConfirmPassword;

		//@FindBy(xpath = "//input[@type='checkbox']")
		//WebElement chkdPolicy;

		@FindBy(xpath = "//*[@id='form-register']/div/div/button")
		WebElement btnContinue;

		@FindBy(xpath = "//div[@class='col']")
		WebElement form;

		public void setFirstName(String fname) {
			txtFirstname.sendKeys(fname);

		}

		public void setLastName(String lname) {
			txtLasttname.sendKeys(lname);

		}

		public void setEmail(String email) {
			txtEmail.sendKeys(email);

		}

		//public void setTelephone(String tel) {
		//	txtTelephone.sendKeys(tel);

		//}

		public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);

		}

	//	public void setConfirmPassword(String pwd) {
		//	txtConfirmPassword.sendKeys(pwd);

	//	}

	/*	public void setPrivacyPolicy() {
			chkdPolicy.click();

		}
*/
		public void clickContinue() {
			//sol1 
			btnContinue.click();
			
			//sol2 
			//btnContinue.submit();
			
			//sol3
			//Actions act=new Actions(driver);
			//act.moveToElement(btnContinue).click().perform();
						
			//sol4
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("arguments[0].click();", btnContinue);
			
			//Sol 5
			//btnContinue.sendKeys(Keys.RETURN);
			
			//Sol6  
			//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
			
		}

		public boolean getConfirmationMsg()
		{
			try
			{
				
				Assert.assertEquals(form.isDisplayed(), true);
				
			
			}			
			catch (Exception e)
			{
				System.out.println(e);
			}
			return false;

		 }
}