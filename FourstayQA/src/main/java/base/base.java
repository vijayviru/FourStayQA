package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class base {

	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\10659522\\4stayQA\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\10659522\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\10659522\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	
	
// SCreen shot code and using this method in listeners to take screen shot when tc is failed.


public void getScreenshot(String res) throws IOException {
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File Src = scrShot.getScreenshotAs(OutputType.FILE);
	File dest=new File("C://Users//10659522//4stayQA//testresults//"+res+"screenshot.png");
	FileUtils.copyFile(Src, dest);
	
	
}




	


}
