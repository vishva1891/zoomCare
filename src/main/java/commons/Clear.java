package commons;

import org.openqa.selenium.By;

public class Clear extends Commons {

    public static void XPATH(String XPATH) {
	element = driver.findElement(By.xpath(XPATH));
	element.clear();
    }

    public static void multipleXPATH(String XPATH, String jsonValues[]) throws InterruptedException {
	String[] stringList = jsonValues;
	for (int i = 0; i < stringList.length; i++) {
	    String clearMultiple = XPATH + stringList[i] + "')]";
	    XPATH(clearMultiple);
	}
    }

    public static void CLASS(String CLASS) {
	element = driver.findElement(By.xpath(CLASS));
	element.clear();
    }

    public static void LINK(String LINKTEXT) {
	element = driver.findElement(By.linkText(LINKTEXT));
	element.clear();
    }

    public static void ID(String ID) {
	element = driver.findElement(By.id(ID));
	element.clear();
    }

    public static void NAME(String NAME) {
	element = driver.findElement(By.name(NAME));
	element.clear();
    }
}
