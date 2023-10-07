package testseling1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","//Users//samara//Documents//MounicaResume//chromedriver_mac64//chromedriver");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://formy-project.herokuapp.com/switch-window");
		 driver.findElement(By.id("alert-button")).click();
		 Alert alert=driver.switchTo().alert();
		 Thread.sleep(1000);
		 alert.accept();
		 driver.quit();
		 
		 
	}

}
