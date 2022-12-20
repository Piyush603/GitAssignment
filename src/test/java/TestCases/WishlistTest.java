package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.basepage;

import Pages.WishlistPage;

public class WishlistTest extends basepage{
	WishlistPage lp;
	

	public WishlistTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new WishlistPage(null);
	}

	@Test(priority = 1,groups = {"smoke"})
	public void wishlisttt() throws Exception {

		WebElement mouse_hover = driver.findElement(WishlistPage.mouse_hover);
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		WebElement profile = driver.findElement(WishlistPage.Button_click);
		profile.click();
		Thread.sleep(2000);
		
	}
}
