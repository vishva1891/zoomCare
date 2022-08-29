package commons;

import org.openqa.selenium.By;

public class AttributeValue extends Commons {
    public static String XPATH(String XPATH, String attribute) {
	String attributeValue = driver.findElement(By.xpath(XPATH)).getAttribute(attribute);
	return attributeValue;
    }

    public static String LINK(String LINKTEXT, String attribute) {
	String attributeValue = driver.findElement(By.linkText(LINKTEXT)).getAttribute(attribute);
	return attributeValue;
    }

    public static String NAME(String NAME, String attribute) {
    String attributeValue = driver.findElement(By.name(NAME)).getAttribute(attribute);
    return attributeValue;
    }

    public static String ID(String ID, String attribute) {
	String attributeValue = driver.findElement(By.id(ID)).getAttribute(attribute);
	return attributeValue;
    }

    public static String CLASS(String CLASS, String attribute) {
	String attributeValue = driver.findElement(By.className(CLASS)).getAttribute(attribute);
	return attributeValue;
    }

}
