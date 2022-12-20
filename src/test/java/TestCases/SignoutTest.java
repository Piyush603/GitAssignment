package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.basepage;
import Pages.LoginPage;
import Pages.SignoutPage;
import Pages.WishlistPage;
import Utilities.PropertiesFile;

public class SignoutTest extends basepage {
	SignoutPage lp;

	public SignoutTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new SignoutPage(null);
	}

	@Test(priority = 1, groups = { "smoke" })
	public void logout () throws Exception {
		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		
		driver.findElement(LoginPage.btn_Login2).sendKeys(PropertiesFile.prop.getProperty("email"));
		driver.findElement(LoginPage.btn_Submit1).click();
		driver.findElement(LoginPage.txt_password).sendKeys(PropertiesFile.prop.getProperty("Password"));
		driver.findElement(LoginPage.btn_Submit2).click();
		Thread.sleep(3000);
	
		WebElement mouse_hover = driver.findElement(WishlistPage.mouse_hover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(SignoutPage.btn_signout);
		profile.click();
		Thread.sleep(2000);

}
}
