package commons;

import org.openqa.selenium.By;

public class GetText extends Commons {
    public static String XPATH(String XPATH) {
	String text = driver.findElement(By.xpath(XPATH)).getText();
	return text;
    }

    public static String ID(String ID) {
	String text = driver.findElement(By.id(ID)).getText();
	return text;
    }

    public static String LINK(String LinkText) {
	String text = driver.findElement(By.linkText(LinkText)).getText();
	return text;
    }

    public static String CLASS(String CLASS) {
	String text = driver.findElement(By.className(CLASS)).getText();
	return text;
    }
}
