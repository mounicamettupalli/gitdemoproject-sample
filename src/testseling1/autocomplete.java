package testseling1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//samara//Documents//MounicaResume//chromedriver_mac64//chromedriver");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://formy-project.herokuapp.com/scroll");
		 WebElement name1= driver.findElement(By.id("name"));
		 Actions i=new Actions(driver);
		 i.moveToElement(name1);
		 name1.sendKeys("testing");
		 driver.findElement(By.id("date")).sendKeys("2023-08-14");
		 Thread.sleep(1000);
		 driver.quit(); 
	}

	}


