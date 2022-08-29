package commons;

import org.openqa.selenium.By;

public class Selected extends Commons {
    public static boolean XPATH(String XPATH) {
	element = driver.findElement(By.xpath(XPATH));
	return element.isSelected();
    }

    public static boolean CLASS(String CLASS) {
	element = driver.findElement(By.className(CLASS));
	return element.isSelected();
    }

    public static boolean ID(String ID) {
	element = driver.findElement(By.id(ID));
	return element.isSelected();
    }

    public static boolean LINK(String LINK) {
	element = driver.findElement(By.linkText(LINK));
	return element.isSelected();
    }
}
