package testseling1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 // TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver","//Users//samara//Documents//MounicaResume//chromedriver_mac64//chromedriver");
		WebDriver driver= new ChromeDriver();
		 driver.get("http://the-internet.herokuapp.com/");
		 driver.quit(); 
	}

}
