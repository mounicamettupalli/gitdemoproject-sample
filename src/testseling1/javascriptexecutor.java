package testseling1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor 
{
	public static void main(String[] args) 
	{
		
	
	
	System.setProperty("webdriver.chrome.driver","//Users//samara//Documents//MounicaResume//chromedriver_mac64//chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/modal");
	WebElement s1= driver.findElement(By.id("modal-button")).click();
	
	WebElement s2= driver.findElement(By.id("close-button")).click();
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
}

}
