package TestCases;

import java.io.IOException;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.basepage;
import Pages.LoginPage;
import Utilities.PropertiesFile;


public class LoginTest extends basepage {
	LoginPage lp;
	//private static Logger logger = LogManager.getLogger(LoginTest.class);

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new LoginPage(null);
	}

	@Test(priority = 1,groups = {"smoke"})
	public void correctemailtest() throws Exception {

		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		
		driver.findElement(LoginPage.btn_Login2).sendKeys(PropertiesFile.prop.getProperty("email"));
		driver.findElement(LoginPage.btn_Submit1).click();
		driver.findElement(LoginPage.txt_password).sendKeys(PropertiesFile.prop.getProperty("Password"));
		driver.findElement(LoginPage.btn_Submit2).click();
		Thread.sleep(3000);
		//Assert.assertEquals(driver.getTitle(),
		//		"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		//System.out.println("Assert passed");	
		//logger.info("Logging Successful");
	}
	@Test(priority = 2,groups = {"smoke"})
	public void incorrectemailtest() throws Exception {

		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		
		driver.findElement(LoginPage.btn_Login2).sendKeys(PropertiesFile.prop.getProperty("email"));
		driver.findElement(LoginPage.btn_Submit1).click();
		driver.findElement(LoginPage.txt_password).sendKeys(PropertiesFile.prop.getProperty("Password1"));
		driver.findElement(LoginPage.btn_Submit2).click();
		Thread.sleep(3000);
		//Assert.assertEquals(driver.getTitle(),
		//		"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		//System.out.println("Assert passed");	
		//logger.info("Logging Successful");
	}



	

}
