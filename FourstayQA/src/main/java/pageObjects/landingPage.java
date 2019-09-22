

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;

	By Signin = By.xpath("//*[@id='desktopMenu']/ul/li[2]/a");
	
	public landingPage(WebDriver driver) {
		this.driver  = driver;
	}
	
	public WebElement getSignin() {
		return driver.findElement(Signin);
	}
	
}