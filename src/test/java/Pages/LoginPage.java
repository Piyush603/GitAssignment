package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public static By btn_Login1 = By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]");
	public static By btn_Login2 = By.xpath("//*[@id=\"ap_email\"]");
	public static By btn_Submit1 = By.xpath("//*[@id=\"continue\"]");
	public static By txt_password = By.xpath("//*[@id=\"ap_password\"]");
	public static By btn_Submit2 = By.xpath("//*[@id=\"signInSubmit\"]");

}
