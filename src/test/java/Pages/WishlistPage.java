package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {
	WebDriver driver;
	public WishlistPage(WebDriver driver) {
        this.driver = driver;
    }
	public static By mouse_hover= By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]");
	public static By Button_click= By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]/span");

	

}
