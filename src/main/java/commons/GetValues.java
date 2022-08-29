package commons;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GetValues extends Commons {
    public static String getValuesXPATH(String XPATH) throws UnsupportedFlavorException, IOException {
	StringSelection stringSelection = new StringSelection("");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	element = driver.findElement(By.xpath(XPATH));
	element.click();
	element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	element.sendKeys(Keys.chord(Keys.CONTROL, "c"));
	Clipboard searchResult = Toolkit.getDefaultToolkit().getSystemClipboard();
	String value = (String) searchResult.getData(DataFlavor.stringFlavor);
	return value;
    }
}
