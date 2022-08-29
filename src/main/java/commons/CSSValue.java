package commons;

import org.openqa.selenium.By;

public class CSSValue extends Commons {
    public static String XPATH(String XPATH, String attribute) {
	String cssValue = driver.findElement(By.xpath(XPATH)).getCssValue(attribute);
	return cssValue;
    }

    public static String ID(String ID, String attribute) {
	String cssValue = driver.findElement(By.id(ID)).getCssValue(attribute);
	return cssValue;
    }

    public static String CLASS(String CLASS, String attribute) {
	String cssValue = driver.findElement(By.className(CLASS)).getCssValue(attribute);
	return cssValue;
    }

    public static String LINK(String LINK, String attribute) {
	String cssValue = driver.findElement(By.linkText(LINK)).getCssValue(attribute);
	return cssValue;
    }
}
