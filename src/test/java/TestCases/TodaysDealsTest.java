package TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.basepage;
import Pages.TodaysDealsPage;

public class TodaysDealsTest extends basepage {
	TodaysDealsPage lp;

	public TodaysDealsTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new TodaysDealsPage(null);
	}

	@Test(priority = 1, groups = { "smoke" })
	public void bestseller () throws Exception {
		driver.findElement(TodaysDealsPage.btn_todaysdeals).click();
		Thread.sleep(2000);
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
