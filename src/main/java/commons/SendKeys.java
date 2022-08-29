package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SendKeys extends Commons {
    public static void XPATH(String XPATH, String text) {
	WebElement element = driver.findElement(By.xpath(XPATH));
	element.click();
	element.clear();
	element.sendKeys(text);
    }

    public static void ID(String ID, String text) {
	WebElement element = driver.findElement(By.id(ID));
	element.click();
	element.clear();
	element.sendKeys(text);
    }

    public static void NAME(String NAME, String Text) {
	WebElement element = driver.findElement(By.name(NAME));
	element.click();
	element.clear();
	element.sendKeys(Text);
    }

    public static void CLASS(String CLASS, String Text) {
	WebElement element = driver.findElement(By.className(CLASS));
	element.click();
	element.clear();
	element.sendKeys(Text);
    }
}

