package CommonCode;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ExpediaBaseClass {
 
	public WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\cecy0\\eclipse-bootcamp2021\\ExpediaBootcampExercise\\drivers\\chromedriver.exe");
	   driver=new ChromeDriver(); 
	   driver.get("https://www.expedia.com");
	   driver.manage().window().maximize();
}

  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  driver.quit();
  }

}
