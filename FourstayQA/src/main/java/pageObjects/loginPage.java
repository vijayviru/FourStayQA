package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;

	By email = By.xpath("//*[@id='user_login']");
	By password = By.xpath("//*[@id='user_password']");
	By signin = By.xpath("//*[@id='login_btn']");
	By close = By.xpath("//button[@class=\"close\"]");
	By loginStatus = By.xpath("//*[@id='login_status']");
	By forgotPassword = By.xpath("//*[@class=\'content\']/form/div[2]/div[2]/a");
	By emailReset = By.xpath("//*[@id='user_email']");
	By passwordResetButton = By.xpath("//*[@value='Send me reset password instructions']");
	By passwordResetConfirm = By.xpath("//*[@class=\' stop-scrolling\']/div[3]/p");
	By passwordResetConfirmOK = By.xpath("//*[@class=' stop-scrolling']/div[3]/div[7]/div[1]/button");
			
	
	
	
	
	
	public loginPage(WebDriver driver) {
		this.driver  = driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getSignin() {
		return driver.findElement(signin);
	}
	public WebElement getClose() {
		return driver.findElement(close);
		
	}
	public WebElement getLoginStatus() {
		return driver.findElement(loginStatus);
		
	}
	
	
	public WebElement getForgotPassword() {
		return driver.findElement(forgotPassword);
	
	}
	
	public WebElement getEmailReset() {
		return driver.findElement(emailReset);
	
	}
	
	
	public WebElement getPasswordResetButton() {
		return driver.findElement(passwordResetButton);
	
	}
	
	public WebElement getPasswordResetConfirm() {
		return driver.findElement(passwordResetConfirm);
	
	}
	
	public WebElement getPasswordResetConfirmOK() {
		return driver.findElement(passwordResetConfirmOK);
	
	}
	
	
	
}
