package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignoutPage {
	WebDriver driver;
	public SignoutPage(WebDriver driver) {
        this.driver = driver;
	}
	public static By btn_signout= By.xpath("//*[@id=\"nav-item-signout\"]/span");


}
