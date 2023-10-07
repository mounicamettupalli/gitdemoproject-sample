package testseling1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//samara//Documents//MounicaResume//chromedriver_mac64//chromedriver");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://formy-project.herokuapp.com/keypress");
		 driver.findElement(By.id("name")).sendKeys("test");
		 driver.findElement(By.id("button")).click();
		 driver.quit(); 
	}

}
