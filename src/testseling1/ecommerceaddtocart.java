package testseling1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecommerceaddtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//samara//Documents//MounicaResume//chromedriver_mac64//chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("twotabtextsearchbox")).sendKeys("iphone12");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.get("https://www.amazon.ca/Apple-iPhone-12-64GB-Blue/dp/B08PNM1LNZ/ref=sr_1_1?crid=41WQE5WXOJEV&keywords=iphone+12&qid=1693488040&sprefix=iphone12%2Caps%2C115&sr=8-1");
		driver.findElement(By.id("add-to-cart-button")).click();
		
		

	}

}
