package testseling1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//samara//Documents//MounicaResume//chromedriver_mac64//chromedriver");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://formy-project.herokuapp.com/switch-window");
		 driver.findElement(By.id("new-tab-button")).click();
		 String originalwindowhandler=driver.getWindowHandle();
		 for(String handle1:driver.getWindowHandles())
		 {
			 driver.switchTo().window(handle1);
		 }
			 
		 driver.switchTo().window(originalwindowhandler);
		 driver.quit();
		 

	}

}
