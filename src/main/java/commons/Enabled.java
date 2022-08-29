package commons;

import org.openqa.selenium.By;

public class Enabled extends Commons {
    public static boolean XPATH(String XPATH) {
	element = driver.findElement(By.xpath(XPATH));
	return element.isEnabled();
    }

    public static boolean LINK(String LINK) {
	element = driver.findElement(By.linkText(LINK));
	return element.isEnabled();
    }

    public static boolean ID(String ID) {
	element = driver.findElement(By.id(ID));
	return element.isEnabled();
    }

    public static boolean CLASS(String CLASS) {
	element = driver.findElement(By.className(CLASS));
	return element.isEnabled();
    }
}
