package commons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectBy extends Commons {
    public static void ValueXPATH(String XPATH, String Value) {
	Select select = new Select(driver.findElement(By.xpath(XPATH)));
	select.selectByValue(Value);
    }

    public static void IndexXPATH(String XPATH, Integer Index) {
	Select select = new Select(driver.findElement(By.xpath(XPATH)));
	select.selectByIndex(Index);
    }

    public static void VisibleTextXPATH(String XPATH, String Text) {
	Select select = new Select(driver.findElement(By.xpath(XPATH)));
	select.selectByVisibleText(Text);
    }

    public static int SizeXPATH(String XPATH) {
	Select select = new Select(driver.findElement(By.xpath(XPATH)));
	List<WebElement> selectOptions = select.getOptions();
	return selectOptions.size();
    }

    public static void ValueID(String ID, String Value) {
	Select select = new Select(driver.findElement(By.id(ID)));
	select.selectByValue(Value);
    }

    public static void IndexID(String ID, Integer Index) {
	Select select = new Select(driver.findElement(By.id(ID)));
	select.selectByIndex(Index);
    }

    public static void VisibleTextID(String ID, String Text) {
	Select select = new Select(driver.findElement(By.id(ID)));
	select.selectByVisibleText(Text);
    }

    public static int SizeID(String ID) {
	Select select = new Select(driver.findElement(By.id(ID)));
	List<WebElement> selectOptions = select.getOptions();
	return selectOptions.size();
    }

    public static void ValueCLASS(String CLASS, String Value) {
	Select select = new Select(driver.findElement(By.className(CLASS)));
	select.selectByValue(Value);
    }

    public static void IndexCLASS(String CLASS, Integer Index) {
	Select select = new Select(driver.findElement(By.className(CLASS)));
	select.selectByIndex(Index);
    }

    public static void VisibleTextCLASS(String CLASS, String Text) {
	Select select = new Select(driver.findElement(By.className(CLASS)));
	select.selectByVisibleText(Text);
    }

    public static int SizeCLASS(String CLASS) {
	Select select = new Select(driver.findElement(By.className(CLASS)));
	List<WebElement> selectOptions = select.getOptions();
	return selectOptions.size();
    }

    public static void ValueNAME(String NAME, String Value) {
	Select select = new Select(driver.findElement(By.name(NAME)));
	select.selectByValue(Value);
    }

    public static void IndexNAME(String NAME, Integer Index) {
	Select select = new Select(driver.findElement(By.name(NAME)));
	select.selectByIndex(Index);
    }

    public static void VisibleTextNAME(String NAME, String Text) {
	Select select = new Select(driver.findElement(By.name(NAME)));
	select.selectByVisibleText(Text);
    }

    public static int SizeNAME(String NAME) {
	Select select = new Select(driver.findElement(By.name(NAME)));
	List<WebElement> selectOptions = select.getOptions();
	return selectOptions.size();
    }

}
