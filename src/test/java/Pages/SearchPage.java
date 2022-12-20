package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver) {
        this.driver = driver;
	}
	public static By Search_Click= By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	public static By Submit= By.xpath("//*[@id=\"nav-search-submit-button\"]");
	
	
}
