package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExpediaCheckoutPOM {

	public static WebDriver driver;
	
	@FindBy (xpath= "//*[@id='firstname[0]']") WebElement FirstNamefield;
	@FindBy (xpath= "//*[@data-tealeaf-name='middleName']") WebElement MiddleNamefield;
	@FindBy (xpath= "//*[@id='lastname[0]']") WebElement LastNamefield;
	@FindBy (xpath= "(//*[@aria-label='Country/Territory Code'])[1]") WebElement Countryfield;
	@FindBy (xpath= "//*[@id='phone-number[0]']") WebElement PhoneNumberfield;
	@FindBy (xpath= "//*[@id='passport[0]']") WebElement Passportfield;
	@FindBy (xpath= "//*[@id='gender_male[0]']") WebElement Genderfield;
	@FindBy (xpath= "//*[@id='date_of_birth_month0']") WebElement Birthfield;
	@FindBy (xpath= "//*[@id='date_of_birth_day[0]']") WebElement Dayfield;
	@FindBy (xpath= "//*[@id='date_of_birth_year[0]']") WebElement Yearfield;
	
	public ExpediaCheckoutPOM(WebDriver driver) {	
		ExpediaCheckoutPOM.driver=driver;
		PageFactory.initElements(driver, this);		
}
	
	public void FirstNametext() {
		FirstNamefield.sendKeys("John");
}
	public void MiddleNametext() {
		MiddleNamefield.sendKeys("M");
}
	public void LastNametext() {
		LastNamefield.sendKeys("Smith");
}
	public void Countryclick() {
		Select obj = new Select(Countryfield);
		obj.selectByVisibleText("United States of America +1");
}
	public void Phonetext() {
		PhoneNumberfield.sendKeys("9411234567");
}
	public void Passportclick() {
		Select obj1 = new Select(Passportfield);
		obj1.selectByValue("4281173");
}
	public void Genderclick() {
		Genderfield.click();
}
	public void BirthDateSelect() {
		Select obj2 = new Select(Birthfield);
		obj2.selectByVisibleText("06 - Jun");
}
	public void DaySelect() {
		Select obj3 = new Select(Dayfield);
		obj3.selectByVisibleText("10");
}
	public void YearSelect() {
		Select obj4 = new Select(Yearfield);
		obj4.selectByVisibleText("1978");
}
	
}
