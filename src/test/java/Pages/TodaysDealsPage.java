package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodaysDealsPage {
	WebDriver driver;
	public TodaysDealsPage(WebDriver driver) {
        this.driver = driver;
	}
	public static By btn_todaysdeals= By.xpath("//*[@id=\"nav-xshop\"]/a[4]");


}
