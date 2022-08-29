package commons;

import org.openqa.selenium.By;

public class Displayed extends Commons {
    public static boolean LINK(String LINKTEXT) {
	element = driver.findElement(By.linkText(LINKTEXT));
	return element.isDisplayed();
    }

    public static boolean NAME(String NAME) {
	element = driver.findElement(By.name(NAME));
	return element.isDisplayed();
    }

    public static boolean XPATH(String XPATH) {
	element = driver.findElement(By.xpath(XPATH));
	return element.isDisplayed();
    }

    public static boolean CSS(String CSS) {
    element = driver.findElement(By.cssSelector(CSS));
    return element.isDisplayed();
    }

    public static boolean CLASS(String CLASS) {
	element = driver.findElement(By.className(CLASS));
	return element.isDisplayed();
    }

    public static boolean ID(String ID) {
	element = driver.findElement(By.id(ID));
	return element.isDisplayed();
    }
}
