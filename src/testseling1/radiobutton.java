package testseling1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","//Users//samara//Documents//MounicaResume//chromedriver_mac64//chromedriver//");
		WebDriver driver= new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/modal");
		driver.findElement(By.id("radio-button-1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("radio-button-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("radio-button-3")).click();
		}
}
