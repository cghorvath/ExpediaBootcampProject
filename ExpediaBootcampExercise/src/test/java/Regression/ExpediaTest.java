package Regression;

import org.testng.annotations.Test;

import CommonCode.ExpediaBaseClass;
import Pages.ExpediaCheckoutPOM;
import Pages.ExpediaFlightsPOM;
import Pages.ExpediaHomePOM;

public class ExpediaTest extends ExpediaBaseClass {
  
	
	@Test (priority = 1)
    public void Test1() throws InterruptedException {
		ExpediaHomePOM ob = new ExpediaHomePOM(driver);
		ob.Flightsclick();
		Thread.sleep(3000);
		ob.Roundtripclick();
		Thread.sleep(3000);
		ob.Leavingtext();
		Thread.sleep(3000);
		ob.Goingtotext();
 }
  
	@Test (priority = 2)
    public void Test2() throws InterruptedException {
		ExpediaHomePOM ob1 = new ExpediaHomePOM(driver);
		ob1.Departingclick();
		Thread.sleep(3000);
		ob1.StartCalendar();
		Thread.sleep(3000);
		ob1.Doneclick1();
		
		ob1.Returningclick();
		Thread.sleep(3000);
		ob1.EndCalendar();
		Thread.sleep(3000);
		ob1.Doneclick2();
		Thread.sleep(3000);
		ob1.Searchclick();
}
	

	@Test (priority = 3)
    public void Test3() throws InterruptedException {
		ExpediaFlightsPOM ob2 = new ExpediaFlightsPOM(driver);
		ob2.FirstFlight();
		Thread.sleep(3000);
		ob2.Selectflight1();
		Thread.sleep(3000);
		ob2.Secondflight();
		Thread.sleep(3000);
		ob2.Selectflight2();
		Thread.sleep(5000);
		
		ob2.Checkoutclick();
		Thread.sleep(5000);
}
  
	@Test (priority = 4)
    public void Test4() throws InterruptedException {
		ExpediaCheckoutPOM ob3 = new ExpediaCheckoutPOM(driver);
		ob3.FirstNametext();
		Thread.sleep(3000);
		ob3.MiddleNametext();
		Thread.sleep(3000);
		ob3.LastNametext();
		Thread.sleep(3000);
		ob3.Countryclick();
		Thread.sleep(3000);
		ob3.Phonetext();
		Thread.sleep(3000);
		ob3.Passportclick();
		Thread.sleep(3000);
		ob3.Genderclick();
		Thread.sleep(3000);
		ob3.BirthDateSelect();
		Thread.sleep(3000);
		ob3.DaySelect();
		Thread.sleep(3000);
		ob3.YearSelect();
		Thread.sleep(3000);
}
	
}
