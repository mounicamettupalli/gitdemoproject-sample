package testseling1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//samara//Documents//MounicaResume//chromedriver_mac64//chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/modal");
		driver.findElement(By.id("dropdownMenubutton")).click();
		
	}

}
