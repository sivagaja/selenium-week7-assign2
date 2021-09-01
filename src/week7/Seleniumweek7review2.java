package week7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Seleniumweek7review2 {
	
      @Test
	public void test(){
		
		System.setProperty("webdriver.chrome.driver", "C:\Users\gajen\Downloads\chromedriver_win32\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Welcome  to Ebay...");
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.close();
		
	}
	

}
