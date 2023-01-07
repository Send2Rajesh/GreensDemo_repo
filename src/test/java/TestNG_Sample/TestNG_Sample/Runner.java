package TestNG_Sample.TestNG_Sample;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Runner extends BaseClass{
public static void main(String[] args) throws IOException {
	BrowserLaunch();
	window_Max();
	getURL("https://www.amazon.in/");
	elementSendkeys(driver.findElement(By.id("twotabsearchtextbox")), "Sony TV");
	elementClick(driver.findElement(By.id("nav-search-submit-button")));
	
	List<WebElement> product = driver.findElements(By.xpath("//span[text()='RESULTS']//following::span[contains(@class,'a-size-medium')]"));
	
	for (int i = 0; i < product.size(); i++) {
		write_Xl(i, 0, product.get(i).getText());
	}
}
}