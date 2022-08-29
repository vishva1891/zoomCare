package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commons.AttributeValue;
import commons.Click;
import commons.Commons;
import commons.Displayed;
import commons.GetText;
import commons.SelectBy;
import commons.Selected;
import commons.SendKeys;
import commons.Windows;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;


public class ZoomSchedule extends Commons {

	WebDriverWait wait = new WebDriverWait(driver, 60);
	
    @Then("^Verify zipcode search is working$")
    public void zipCodeSearch(DataTable userCredentials) throws InterruptedException {
    	boolean isPassed = true;
    	TestResult = "";
    	List<Map<String, String>> data = userCredentials.asMaps(String.class, String.class);
    	
    	driver.get("https://www.zoomcare.com/schedule");
   
    	Click.XPATH("//span[contains(text(),'in ')]");
    	Thread.sleep(5000);
    	SendKeys.XPATH("//input", "98101");
    	driver.findElement(By.xpath("//input")).sendKeys(Keys.ARROW_DOWN);
    	driver.findElement(By.xpath("//input")).submit();
    	
    	if(driver.findElement(By.xpath("//div[contains(text(),'View Clinic Services')]")).isDisplayed()) {
			TestResult = "List of appointments are displayed, available in the area";
		 	}
		 else{
			isPassed= false; 
			TestResult = "Appointments are not displayed";
		 	 }
		
		
	} 
	@Then("^Verify My location search is working$") 
	public void locationSearch(DataTable userCredentials) throws InterruptedException {
		boolean isPassed = true;
		TestResult = "";
		List<Map<String, String>> data = userCredentials.asMaps(String.class, String.class);
		
    	Windows.waitBrowser();
    	Click.XPATH("//span[contains(text(),'in ')]");

    	Click.XPATH("//div[contains(text(),'Use my location')]");
	   
    	if(driver.findElement(By.xpath("//div[contains(text(),'View Clinic Services')]")).isDisplayed()) {
			TestResult = "List of appointments are displayed, available in the area";
		 	}
		 else{
			isPassed= false; 
			TestResult = "Appointments are not displayed";
		 	 }
	    
	} 
	
	@Then("^Verify clicking on a slot$") 
	public void editCustomer(DataTable userCredentials) throws InterruptedException {
		boolean isPassed = true;
		TestResult = "";
		List<Map<String, String>> data = userCredentials.asMaps(String.class, String.class);

		Click.XPATH("//div[contains(text(),'7:00 AM')]");

	    if(Displayed.ID("log_in_button-loginModal.register.logIn")) {
	    	TestResult = "Login screen is displayed as expected";
	    	}
	    else {
	    	isPassed = false;
	    	TestResult = "Login page not is displayed";

	    	}
		}
	}
