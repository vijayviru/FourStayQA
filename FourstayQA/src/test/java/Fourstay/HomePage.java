package Fourstay;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.base;
import pageObjects.landingPage;
import pageObjects.loginPage;

public class HomePage extends base{
	
	//logging.
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	

/*   
 	//Test case with hard coded URl, credentials.
	//Test case 1: launch and login with correct credentials.
	@Test
	
	public void basepageNavigation() throws IOException
	{   
		//Step 1: launch driver and the URL using the BeforeMethod annotation.
		
		//Step2 : click on the sign in button
		landingPage l = new landingPage(driver);
		l.getSignin().click();
		
		//step 3: enter email , password an d click login.
		loginPage lp= new loginPage(driver);
		lp.getEmail().sendKeys("vijayviru1993@gmail.com");
		lp.getPassword().sendKeys("ka53s6782");
		lp.getSignin().click();
		
	}



	// TC without hard coded details.
	//Test case 2: launch and login with correct credentials.
		@Test
		
		public void basepageNavigationFILE() throws IOException
		{   
			//Look for properties file.
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\10659522\\4stayQA\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			
			//Step 1: launch driver and the URL using the BeforeMethod annotation.
			
			//Step2 : click on the sign in button
			landingPage l = new landingPage(driver);
			l.getSignin().click();
			
			//step 3: enter email , password an d click login.
			loginPage lp= new loginPage(driver);
			lp.getEmail().sendKeys(prop.getProperty("email"));
			lp.getPassword().sendKeys(prop.getProperty("password"));
			lp.getSignin().click();
			
		}

	
		
		
		// TC using data provider and without hard coded details.
		//Test case 3 and 4: launch and login with correct credentials.
		
	@Test(dataProvider = "getData")
			
			public void basepageNavigationDP(String UN,String PW) throws IOException, InterruptedException
			{   
				//Look for properties file.
				Properties prop = new Properties();
				FileInputStream fis = new FileInputStream("C:\\Users\\10659522\\4stayQA\\src\\main\\java\\resources\\data.properties");
				prop.load(fis);
				
				//Step 1: launch driver and the URL using the BeforeMethod annotation.
				
				//Step2 : click on the sign in button
				landingPage l = new landingPage(driver);
				l.getSignin().click();
				
				//step 3: enter email , password an d click login.
				loginPage lp= new loginPage(driver);
				lp.getEmail().sendKeys(UN);
				lp.getPassword().sendKeys(PW);
				lp.getSignin().click();
				
				
							}
	
	
		
	//Test case 5: launch and close login page
	
	@Test
	public void loginPageClose() throws IOException, InterruptedException
	{
			
	
		//Step 1: launch driver and the URL using the BeforeMethod annotation.

		
		//Step2 : click on the sign in button
		landingPage l = new landingPage(driver);
		l.getSignin().click();
		
		//step 3: enter email , password an d click login.
		loginPage lp= new loginPage(driver);
		lp.getEmail().sendKeys("vijayviru1993@gmail.com");
		
		// incorrect password
		lp.getPassword().sendKeys("ka5jdcwji");
		Thread.sleep(3000);
		lp.getClose().click();
		
	}
	

*/
	
	//Test case 6: invalid credentials and validate error message (invalid error message to capture the screenshot).
	@Test
	public void loginPageLoginStatusAssertused() throws IOException, InterruptedException
	{
		//Step 1: launch driver and the URL using the BeforeMethod annotation.
		
		//Step2 : click on the sign in button
		landingPage l = new landingPage(driver);
		l.getSignin().click();
		
		//step 3: enter email , password an d click login.
		loginPage lp= new loginPage(driver);
		lp.getEmail().sendKeys("vijayviru");
		
		// step 4 : incorrect credentials
		lp.getPassword().sendKeys("ka5jdcwji");
		Thread.sleep(3000);
		lp.getSignin().click();
				
		Thread.sleep(5000);
		String loginError = lp.getLoginStatus().getText();
				
		//step 5: validate error checking
		System.out.println(loginError);
		
		//Assertion validation , true or false validation.		
				
		Assert.assertEquals(loginError, "Invalid credentials. Please try again.(remove)"); 
		
		
	}
	
/*
	//Test case 7: invalid password and validate error message.
		@Test
		public void loginPageLoginStatusForPassword() throws IOException, InterruptedException
		{
			//Step 1: launch driver and the URL using the BeforeMethod annotation.
			
			//Step2 : click on the sign in button
			landingPage l = new landingPage(driver);
			l.getSignin().click();
			
			//step 3: enter email with wrong password and click login.
			loginPage lp= new loginPage(driver);
			lp.getEmail().sendKeys("vijayviru1993@gmail.com");
			
			// step 4 : incorrect credentials
			lp.getPassword().sendKeys("ka5jdcwji");
			Thread.sleep(3000);
			lp.getSignin().click();
			Thread.sleep(5000);
			String loginError = lp.getLoginStatus().getText();
			
			//step 5: validate error checking
			System.out.println(loginError);
			
			String actualError= "Invalid email or password. Please try again.";

			if(actualError.equals(loginError)) 
			    {
			        System.out.println("Test Case Passed");
			    }
			    else
			    {
			        System.out.println("Test Case Failed");
			    }
			
			
		}
	
	
	//Test case 8: invalid email and validate error message.
		@Test
		public void loginPageLoginStatusForEmail() throws IOException, InterruptedException
		{
			//Step 1: launch driver and the URL using the BeforeMethod annotation.
			
			//Step2 : click on the sign in button
			landingPage l = new landingPage(driver);
			l.getSignin().click();
			
			//step 3: enter email with wrong password and click login.
			loginPage lp= new loginPage(driver);
			lp.getEmail().sendKeys("vijayviru19@gmail.com");
			
			// step 4 : incorrect credentials
			lp.getPassword().sendKeys("ka53s6782");
			Thread.sleep(3000);
			lp.getSignin().click();
			Thread.sleep(5000);
			String loginError = lp.getLoginStatus().getText();
			
			//step 5: validate error checking
			System.out.println(loginError);
			
			String actualError= "Invalid credentials. Please try again.";

			if(actualError.equals(loginError)) 
			    {
			        System.out.println("Test Case Passed");
			    }
			    else
			    {
			        System.out.println("Test Case Failed");
			    }
					
		}
	
		
		//Test case 9: forgotpassword.
				@Test
				public void loginPageForgotPassword() throws IOException, InterruptedException
				{
					Properties prop = new Properties();
					FileInputStream fis = new FileInputStream("C:\\Users\\10659522\\4stayQA\\src\\main\\java\\resources\\data.properties");
					prop.load(fis);
					
					
					//Step 1: launch driver and the URL using the BeforeMethod annotation.
					
					//Step2 : click on the sign in button
					landingPage l = new landingPage(driver);
					l.getSignin().click();
					
					//step 3: enter email with wrong password and click login.
					loginPage lp= new loginPage(driver);
					lp.getEmail().sendKeys(prop.getProperty("email"));
					
					// step 4 : incorrect credentials
					lp.getPassword().sendKeys(prop.getProperty("incorrectpw"));
					Thread.sleep(3000);
					lp.getSignin().click();
					Thread.sleep(5000);
					String loginError = lp.getLoginStatus().getText();
					
					//step 5: validate error checking
					System.out.println(loginError);
					Thread.sleep(5000);
					
					Assert.assertEquals(loginError, "Invalid email or password. Please try agai"); 
						
					//step6 : click on forgot password.
					
					lp.getForgotPassword().click();
					
					//step7 : enter email for resetting password
					
					lp.getEmailReset().sendKeys("vijayviru1993@gmail.com");
					
					//step8: click on send me reset instructions.
					
					lp.getPasswordResetButton().click();
					
					//step9 :verify the confirmation message
					
					String passConfirmmsg = lp.getPasswordResetConfirm().getText();
					
					System.out.println(passConfirmmsg);
					
					Thread.sleep(5000);
					
					Assert.assertEquals(loginError, "You will receive an email with instructions on how to reset your password in a few minutes."); 
					
					
					Thread.sleep(3000);
					//step 10 : click on OK message.
					
					lp.getPasswordResetConfirmOK().click();
				}
				

*/

	//Before and After Methods  and TC without hard coded details.
	//Test case 2: launch and login with correct credentials.
	

	@Test
		
		public void basepageNavigationFILE() throws IOException, InterruptedException
		{   
			
		
			//Look for properties file.
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\10659522\\4stayQA\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			
					
			//Step2 : click on the sign in button
			landingPage l = new landingPage(driver);
			l.getSignin().click();
			
		    log.info("log test - user click's sign in button");	
			
			//step 3: enter email , password an d click login.
			loginPage lp= new loginPage(driver);
			lp.getEmail().sendKeys(prop.getProperty("email"));
			lp.getPassword().sendKeys(prop.getProperty("password"));
			lp.getSignin().click();
			Thread.sleep(10000);
			
		}
	
		
	@BeforeMethod
	 
	public void initialize() throws IOException, InterruptedException
	{
		//Look for properties file.
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\10659522\\4stayQA\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		//step 0: launch driver
		driver = initializeDriver();
		
	    log.info("driver initilized");
		
	
		//Step 1: launch the URL
		driver.get(prop.getProperty("url"));
		
		log.info("navigated to new page");
		Thread.sleep(5000);
		
		//Resize current window to the set dimension
	    driver.manage().window().maximize();
	       
	    //To Delay execution for 10 sec. as to view the maximize browser
	     Thread.sleep(5000);
	}



	@AfterMethod
	
	public void teardown()
	
	{
		driver.close();
		
		log.info("driver closed");
	}


		
	@DataProvider
	
	public Object[][] getData() throws IOException 
	
	{
		// 2 rows and 2 coloumns , 2 username and 2 passwoeds.
		Object[][] data = new Object [2][2];
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\10659522\\4stayQA\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		// 0th row , with correct credentials and getting data from prop file
		
		data[0][0] = prop.getProperty("email");
		data[0][1] = prop.getProperty("password");
		
		//1st row , restricted user and credentials from prop file
		data[1][0] = prop.getProperty("restricteduser");
		data[1][1] = prop.getProperty("restrictedpw");
		
				
		return data;
		
	}
}
