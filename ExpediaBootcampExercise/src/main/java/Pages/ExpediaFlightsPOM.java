package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpediaFlightsPOM {

	public static WebDriver driver;
	
	@FindBy (xpath= "(//*[@data-test-id='select-link'])[1]") WebElement Flightgoing;
	@FindBy (xpath= "(//*[@data-test-id='select-button'])[1]") WebElement SelectTab1;
	@FindBy (xpath= "(//*[@data-test-id='select-link'])[1]") WebElement Flightreturning;
	@FindBy (xpath= "(//*[@data-test-id='select-button'])[1]") WebElement SelectTab2;
	@FindBy (xpath= "//*[@data-test-id='goto-checkout-button']") WebElement Checkoutbutton;
	
	public ExpediaFlightsPOM(WebDriver driver) {	
		ExpediaFlightsPOM.driver=driver;
		PageFactory.initElements(driver, this);		
}
	
	public void FirstFlight() {
		//Added explicit wait for manual verification
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@data-test-id='select-link'])[1]"))).click();
}
	public void Selectflight1() {
		SelectTab1.click();
}
	public void Secondflight() {
		Flightreturning.click();
}
	public void Selectflight2() throws InterruptedException {
		SelectTab2.click();
		Thread.sleep(10000);
		//Change of window browser tab
		Set<String> winsession = driver.getWindowHandles();
		Iterator <String> iter = winsession.iterator( );
		
		String window1 = iter.next( );
		String window2 = iter.next( );
		
		driver.switchTo().window(window2);	
}
	public void Checkoutclick() {
		
		Checkoutbutton.click();
}
	
}
