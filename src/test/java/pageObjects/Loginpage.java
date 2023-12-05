package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="username")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@type='Submit']")
	WebElement submit_btn;
	

	public void setuserName(String user) {
		
			txt_username.sendKeys(user);
		}
		
		public void setPassword(String pwd) {
			txt_password.sendKeys(pwd);
		}
		public void clickContinue() {
			submit_btn.submit();
		}
	

	
}
