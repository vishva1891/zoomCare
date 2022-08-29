package commons;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBox extends Commons {
    static Alert alert = null;
    static String AlertString;
    static WebDriverWait wait = new WebDriverWait(driver, 90);

    public static String alert_Text() throws InterruptedException {
	wait.until(ExpectedConditions.alertIsPresent());
	alert = driver.switchTo().alert();
	AlertString = alert.getText();
	return AlertString;
    }
    
    public static boolean isAlertPresent() {
    	try {
    	    driver.switchTo().alert();
    	    return true;
    	} catch (NoAlertPresentException Ex) {
    	    return false;
    	}
       }
    
    public Alert apply(WebDriver driver) {
	try {
	    return driver.switchTo().alert();
	} catch (NoAlertPresentException e) {
	    return null;
	}
    }
    
    public static void alert_accept() {
    	alert = driver.switchTo().alert();
    	alert.accept();
        }
        
    public static void alert_dismiss() {
       	alert = driver.switchTo().alert();
       	alert.dismiss();
           }
}
