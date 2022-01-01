package Pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaHomePOM {

	public static WebDriver driver;
	
	@FindBy (xpath= "(//*[@class='uitk-tab-text'])[2]") WebElement Flightstab;
	@FindBy (xpath= "//*[text()='Roundtrip']") WebElement Roundtriptab;
	@FindBy (xpath= "//*[@aria-label='Leaving from']") WebElement Leavingfield;
	@FindBy (xpath= "//*[@aria-label='Going to']") WebElement Goingtofield;
	@FindBy (xpath= "//button[@id='d1-btn']") WebElement Departingfield;
	@FindBy (xpath= "(//*[@data-day='25'])[1]") WebElement StartDatefield;
	@FindBy (xpath= "//*[@data-stid='apply-date-picker']") WebElement Donebutton1;
	@FindBy (xpath= "//button[@id='d2-btn']") WebElement Returningfield;
	@FindBy (xpath= "(//*[@data-day='10'])[2]") WebElement EndDatefield;
	@FindBy (xpath= "//*[@data-stid='apply-date-picker']") WebElement Donebutton2;
	@FindBy (xpath= "(//*[@type='submit'])[1]") WebElement Searchbutton;
	
	
	public ExpediaHomePOM(WebDriver driver) {	
		ExpediaHomePOM.driver=driver;
		PageFactory.initElements(driver, this);		
}
	
	public void Flightsclick() {
		Flightstab.click();
}
	public void Roundtripclick() {
		Roundtriptab.click();
}
	public void Leavingtext() throws InterruptedException {
		Leavingfield.sendKeys("Tampa (TPA - Tampa Intl.)");
		Thread.sleep(5000);
		Actions ob = new Actions(driver);
		ob.sendKeys(Leavingfield,Keys.ENTER).build().perform();		
}
	public void Goingtotext() throws InterruptedException {
		Goingtofield.sendKeys("Mexico City (MEX - Mexico City Intl.)");
		Thread.sleep(5000);
		Actions ob1 = new Actions(driver);
		ob1.sendKeys(Goingtofield,Keys.ENTER).build().perform();
}
	public void Departingclick() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Departingfield);
}
	public void StartCalendar() {
		StartDatefield.click();
}
	public void Doneclick1() {
		Donebutton1.click();
}
	public void Returningclick() {
		Returningfield.click();
}
	public void EndCalendar() {
		EndDatefield.click();
}
	public void Doneclick2() {
		Donebutton2.click();
}
	public void Searchclick() {
		Searchbutton.click();
}
	
}
