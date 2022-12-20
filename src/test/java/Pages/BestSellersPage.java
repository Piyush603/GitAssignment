package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestSellersPage{
	WebDriver driver;
	public BestSellersPage(WebDriver driver) {
        this.driver = driver;
	}
	public static By Btn_Seller= By.xpath("//*[@id=\"nav-xshop\"]/a[2]");

}
