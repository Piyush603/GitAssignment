package TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.basepage;
import Pages.LoginPage;
import Pages.SearchPage;
import Utilities.PropertiesFile;


public class SearchTest extends basepage {
	
	SearchPage lp;

	public SearchTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new SearchPage(null);
	}

	@Test(priority = 1, groups = { "smoke" })
	public void SearchProduct() throws Exception {
		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		
		driver.findElement(LoginPage.btn_Login2).sendKeys(PropertiesFile.prop.getProperty("email"));
		driver.findElement(LoginPage.btn_Submit1).click();
		driver.findElement(LoginPage.txt_password).sendKeys(PropertiesFile.prop.getProperty("Password"));
		driver.findElement(LoginPage.btn_Submit2).click();
		Thread.sleep(3000);
		
		driver.findElement(SearchPage.Search_Click).sendKeys(PropertiesFile.prop.getProperty("Search"));
		driver.findElement(SearchPage.Submit).click();
		Thread.sleep(2000);
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
		
	}
}
