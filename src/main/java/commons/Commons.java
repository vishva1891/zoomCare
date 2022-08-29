package commons;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import config.FileHelper;

public class Commons {
    /* Global Elements */
    public static WebDriver driver;
    public static WebDriver newdriver;
    public static WebElement element;
    /** Sikuli screen element */
    public static Screen screen = new Screen();
    /** Javascript Executer element */
    public static JavascriptExecutor executor = (JavascriptExecutor) driver;
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    // start reporters
    public static ExtentHtmlReporter htmlReporter;

    // ExtentReports and attach reporter(s)
    public static ExtentReports extent;

    // Extend Report test object
    public static ExtentTest test;

    public static int jsonData = 0;

    /* To Run test suites */
    public static JUnitCore core = new JUnitCore();
    public static Result result = null;
    /** JSON Connection */
    public static JSONParser jsonParser = null;
    public static JSONObject jsonObject = null;
    public static JSONObject dict = null;
    public static JSONArray scenarioList = null;
    public static JSONArray testArray = null;
    public static JSONParser testParser = null;
    public static JSONObject testObject = null;
    /** Spira result map */
    @SuppressWarnings("rawtypes")
    public static Map<String, Comparable> data = new HashMap<String, Comparable>();
    /** Test Result */
    public static String TestResult = "";
    /** Actual Value */
    public static String actualResult = null;
    /** Expected Result */
    public static String expectedResult = null;
    /** Test Block - Result */
    public static String blockedTest = null;
    /** Test Data */
    /**
     * Json Value
     */
    public static String NAVBLUE_ID;
    public static String Browser;
    /** Test Scenario -- Json Value */
    public static String Scenario;
    /** Title of the test case -- Json Value */
    // @Parameter(value = 0)
    public static String title;
    /** Spira Case ID number -- Json Value */
    // @Parameter(value = 1)
    public static String caseID;
    /** Test Run ID - Spira */
    public static int runID;
    /** Future Period Time -- Json Value */
    public static String futurePeriod;
    /** Future Period Time -- Json Value */
    public static String currentPeriod;
    /** Historical Period Time -- Json Value */
    public static String historicalPeriod;
    /** Project ID from test management tool */
    public static int projectID;
    /** SpiraTest UserName */
    public static String spiraUser;
    /** SpiraTest PassWord */
    public static String spiraPass;
    /** Version number of PBS System */
    public static String version;
    /** Test Run Suite name */
    public static String suite;
    
    /** Jira xray varibles */
	public static String testExecutionKey;
	public static String testKey;
	public static String stepId[];
	public static String testRunId; 
	public static String JIRA_URL = "https://jira.navblue.aero";
	public static String JIRA_USERNAME = "anil.vakada";
	public static String JIRA_PASSWORD ="";
	

    public static String AlertMessage[];
    /***
     * End of Json Values
     */
    /** Alert Class object */
    public static Alert alert = null;
    public static String AlertString;
    /** Page Title */
    public static String pageTitle;

    /** Test Case Execution Start Time */
    public static long startTime_case;

    /** Test Case Execution End Time */
    public static long endTime_case;

    /** Test Start Time */
    public static long startTime;

    /** Test End Time */
    public static long endTime;

    /** Test Execution total time */
    public static long totalTime;

    /** Test case run total time */
    public static long totalTime_case;

    /** Get Current Date */
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static LocalDateTime now = LocalDateTime.now();

    /** Published Run Name **/
    public static String publishedRun;

    /** Run Name string value **/
    public static String runName;

    /** Test pass or failure status */
    public static boolean test_status;
    /* Global Elements */

    /** Project URL */
    public static String NFP_PROJECTURL = "http://web6.qa.navtechinc.com/Login/Login.aspx";
    
    /** Project URL */
    public static String NFP_projectUrl_1 = "http://vmczqcontractornfpwww1.qa.navtechinc.com/Login/Login.aspx";
    
    /** iNFPector Tool URL */
    public static String INFPECTOR_URL = "http://navstat.qa.navtechinc.com/infpector";
    
    /** iNFPector Tool URL */
    public static String INFPECTOR_PRODUCTION_URL = "http://navstat1.navyyz.navtechinc.com/infpector";

    /** Gear Shift Project URL */
    public static String gearShift_projectUrl = "http://gearshift3.qa.navtechinc.com/gearshift/#/";

    /** Dispatch express URL */
    public static String dispatchExpressUrl = "http://hsnavykfnfpqa1.ykf.navtechinc.com";

    /** Dispatch express URL */
    public static String dispatchMessagingUrl = "http://alczqykfprn.qa.navtechinc.com/cgi-bin-xml/login.cgi";

    /** Project URL */
    public static String projectUrl = "http://vmczqcontractornfpwww1.qa.navtechinc.com//Login/Login.aspx";

    /** Admin Page URL */
    public static String adminUrl = "http://vmczqcontractornfpwww1.qa.navtechinc.com:1881";

    /** Admin Page URL */
    public static String adminUrl1 = "http://web6.qa.navtechinc.com:1881";

    /** NFP Admin Page URL */
    public static String nfpAdminUrl = "http://vmczqcontractornfpwww1.qa.navtechinc.com:1880/Login/AdministrativeLogin.aspx";
    
    /** Billing Tool URL */
    public static String billingUrl = "http://navstat.qa.navtechinc.com/infpector/usage.html";

    /** iNFPector Tool URL */
    public static String infpectorUrl = "http://navstat.qa.navtechinc.com/infpector";

    /** bespoke Tool URL */
    public static String bespokeUrl = "http://bespoke2.qa.navtechinc.com:8080";

    /** SNIF Page URL */
    public static String snifUrl = "http://czqsnif1.qa.navtechinc.com";

    /** action object */
    public static Actions action;

    /** Get Current Date */

    /** store the total number of screenshots of a test */
	public static int screenShotCount;
	
	public static String getSelectedValueXPATH(String XPATH) {
	String text = "";
	Select select = new Select(driver.findElement(By.xpath(XPATH)));
	List<WebElement> options = select.getOptions();
	if (options.size() != 0) {
	    for (int i = 0; i < options.size(); i++) {
		if (options.get(i).isSelected()) {
		    text = options.get(i).getText();
		    break;
		}
	    }
	    if (text == null || text.isEmpty()) {
		text = null;
	    }
	} else {
	    text = null;
	}
	return text;
    }
    
    
	public static String getSelectedValueID(String ID) {
		String text = "";
		Select select = new Select(driver.findElement(By.id(ID)));
		List<WebElement> options = select.getOptions();
		if (options.size() != 0) {
		    for (int i = 0; i < options.size(); i++) {
			if (options.get(i).isSelected()) {
			    text = options.get(i).getText();
			    break;
			}
		    }
		    if (text == null || text.isEmpty()) {
			text = null;
		    }
		} else {
		    text = null;
		}
		return text;
	    }
	
	/**Function to get the previous date*/
    public static  Date yesterday() {
	    final Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -1);
	    return cal.getTime();
	}

    /** Get Elements in a table, div, form */
    public static ArrayList<String> TextStringList = new ArrayList<String>();

    public static String getListOfElementsXPATH(String xpath) {
	List<WebElement> WebElementList = null;
	WebElementList = (List<WebElement>) driver.findElements(By.xpath(xpath));
	TextStringList = new ArrayList<>(WebElementList.size());
	for (WebElement rows : WebElementList) {
	    if (rows.getText() != null) {
		TextStringList.add(rows.getText());
	    }
	}
	return TextStringList.toString();
    }

    /** validate an element text value in a table */
    public static boolean UniqueTableValueValidation(String OneTableValue) {
	try {
	    List<WebElement> values = (List<WebElement>) driver
		    .findElements(By.xpath("//div[contains(text(),'" + OneTableValue + "')]"));
	    List<String> tableElements = new ArrayList<>(values.size());
	    /* Stores values which contains OneTableValue */
	    for (WebElement rows : values) {
		if (rows.getText().contains(OneTableValue)) {
		    tableElements.add(rows.getText());
		}
	    }
	    /* Compare the value from the table with OneTableValue */
	    if (tableElements.contains(OneTableValue)) {
		return true;
	    } else {
		return false;
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	    return false;
	}
    }

    // click a specified element in a table
    public static boolean UniqueTableValueClick(String OneTableValue) {
	try {
	    List<WebElement> values = (List<WebElement>) driver
		    .findElements(By.xpath("//div[contains(text(),'" + OneTableValue + "')]"));
	    if (values.size() > 0) {
		values.get(0).click();
		return true;
	    } else {
		return false;
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	    return false;
	}
    }

    public static String ResultValidationXPATH(String XPATH) {
	List<WebElement> searchResults = (List<WebElement>) driver.findElements(By.xpath(XPATH));
	List<String> tableResults = new ArrayList<>(searchResults.size());
	for (WebElement rows : searchResults) {
	    if (rows.getText() != null) {
		tableResults.add(rows.getText());
	    }
	}
	String result = tableResults.toString();
	return result;
    }

    public static List<Integer> compareTimes;

    public static void tableTimeValues(String XPATH) {
	List<WebElement> searchResults = (List<WebElement>) driver.findElements(By.xpath(XPATH));
	List<String> tableResults = new ArrayList<>(searchResults.size());
	compareTimes = new ArrayList<>(searchResults.size());
	int i = 0;
	for (i = 0; i < searchResults.size(); i++) {
	    for (WebElement rows : searchResults) {
		if (rows.getText() != null || !rows.getText().isEmpty()) {
		    tableResults.add(rows.getText());
		}
		String abc = tableResults.get(i).replace(":", "").replace("-", "").replace("|", "").replace(" ", "")
			.replace("2014", "");
		if (!abc.isEmpty()) {
		    double xyz = Double.parseDouble(abc);
		    compareTimes.add((int) xyz);
		}
		i++;
	    }
	}
    }

    public static void tableTimeValue(String XPATH) {
	List<WebElement> searchResults = (List<WebElement>) driver.findElements(By.xpath(XPATH));
	compareTimes = new ArrayList<>(searchResults.size());
	for (WebElement rows : searchResults) {
	    if (rows.getText() != null && !rows.getText().isEmpty()) {
		compareTimes.add((int) Double.parseDouble(
			rows.getText().replace("-", "").replace(":", "").replace(" ", "").substring(4, 12)));
	    }
	}
    }

    /** Count web elements */
    public static int elementCount(String XPATH) {
	List<WebElement> totalElement = driver.findElements(By.xpath(XPATH));
	int totalSize = totalElement.size();
	return totalSize;
    }

    public static int getSizeOfListXPATH(String XPATH) {
	Select select = new Select(driver.findElement(By.xpath(XPATH)));
	if (select.getOptions().isEmpty()) {
	    return 0;
	} else {
	    return select.getOptions().size();
	}
    }

    public static int getSizeOfListID(String ID) {
    	Select select = new Select(driver.findElement(By.id(ID)));
    	if (select.getOptions().isEmpty()) {
    	    return 0;
    	} else {
    	    return select.getOptions().size();
    	}
     }
    
    /**
     * Captures string value inside the alert box
     * 
     * @throws InterruptedException
     * 
     */

    public static String alert_Text() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.alertIsPresent());
	alert = driver.switchTo().alert();
	AlertString = alert.getText();
	return AlertString;
    }

    public static boolean isAlertPresent() {
	try {
	    driver.switchTo().alert();
	    return true;
	} catch (NoAlertPresentException Ex) {
	    return false;
	}
    }

    public Alert apply(WebDriver driver) {
	try {
	    return driver.switchTo().alert();
	} catch (NoAlertPresentException e) {
	    return null;
	}
    }

    public static void alert_accept() {
	alert = driver.switchTo().alert();
	alert.accept();
    }

    public static final String SELECTPERIODTIME = "//select[contains(@id,'_tab_periods_')]";

    /** selecting Period Time */
    public static void changeCurrentPeriod() {
	/** Defining Period Time - XPATH */
	Select selectPeriod = new Select(driver.findElement(By.xpath(SELECTPERIODTIME)));
	selectPeriod.selectByVisibleText(futurePeriod);
    }

    /** selecting Period Time */
    public static void changeFuturePeriod() {
	/** Defining Period Time - XPATH */
	Select selectPeriod = new Select(driver.findElement(By.xpath(SELECTPERIODTIME)));
	selectPeriod.selectByVisibleText(futurePeriod);
    }

    /** selecting Period Time */
    public static void changeActivePeriod() {
	/** Defining Period Time - XPATH */
	Select selectPeriod = new Select(driver.findElement(By.xpath(SELECTPERIODTIME)));
	selectPeriod.selectByVisibleText(currentPeriod);
    }

    /** Period dropdown Enabled/Disabled */
    public static boolean enabledCurrentPeriod() {
	WebElement period = driver.findElement(By.xpath(SELECTPERIODTIME));
	return period.isDisplayed();
    }

    /** Screenshot File */
    public static byte[] scrFile = null;
    public static ByteArrayOutputStream screenCapture;
    public static String fileLocation = "";

    public static byte[] screenShot() {
		try {
			Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			Thread.sleep(2000);
			BufferedImage capture = new Robot().createScreenCapture(screenRect);
			fileLocation = FileHelper.directoryName + "\\" + suite + "-" + caseID + "_"
					+ String.valueOf(screenShotCount) + ".png";
			ImageIO.write(capture, "png", new File(fileLocation));
			screenCapture = new ByteArrayOutputStream();
			ImageIO.write(capture, "png", screenCapture);
			screenCapture.flush();
			scrFile = screenCapture.toByteArray();
			screenShotCount++;
			screenCapture.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return scrFile;
	}

    // public static byte[] screenShot() {
    // return scrFile = ((TakesScreenshot)
    // driver).getScreenshotAs(OutputType.BYTES);
    // }

    /** Screenshot for alert */

    /*
     * public static byte[] screenShot() { try { Rectangle screenRect = new
     * Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); waitBrowser();
     * BufferedImage capture = new Robot().createScreenCapture(screenRect);
     * ImageIO.write(capture, "jpg", new File(System.getProperty("java.io.tmpdir") +
     * title + ".jpg")); ByteArrayOutputStream b = new ByteArrayOutputStream();
     * ImageIO.write(capture, "jpg", b); b.flush(); scrFile = b.toByteArray();
     * b.close(); } catch (Exception e) { e.printStackTrace(); } return scrFile; }
     */

    public static String winHandleBefore;
    public static String newWinHandleBefore;

    public static String currentWindow;
    public static int handledWindows = 0;

    public static int handledWindowsSize() {
	handledWindows = driver.getWindowHandles().size();
	return handledWindows;
    }

    public static void newWindow() throws InterruptedException {
	try {
	    ArrayList<String> allWindows = new ArrayList<String>(driver.getWindowHandles());
	    System.out.println(driver.getWindowHandles() + "\n" + allWindows.size());
	    if (allWindows.size() == 2) {
		driver.switchTo().window(allWindows.get(1));
	    } else if (allWindows.size() == 3) {
		driver.switchTo().window(allWindows.get(2));
	    }
	    Thread.sleep(1000);
	    System.out.println(driver.getWindowHandle());
	} catch (Exception e) {
	}
    }

    public static void switchToNewWindow() throws InterruptedException {
	try {
	    currentWindow = null;
	    Thread.sleep(1000);
	    for (String winHandle : driver.getWindowHandles()) {
		if (!winHandle.equals(winHandleBefore) && !winHandle.equals(currentWindow)) {
		    driver.switchTo().window(winHandle);
		    currentWindow = winHandle;
		    Thread.sleep(1000);
		}
	    }
	} catch (Exception e) {
	}
    }

    public static void switchToMainWindow() throws InterruptedException {
	driver.switchTo().window(winHandleBefore);
    }

    public static void switchToNewMainWindow() throws InterruptedException {
	newdriver.switchTo().window(newWinHandleBefore);
    }

    public static void click(String XPATH) {
	WebElement element;
	element = driver.findElement(By.xpath(XPATH));
	element.click();
    }

    public static void clickXPATH(String XPATH) {
	WebElement element;
	element = driver.findElement(By.xpath(XPATH));
	if (!element.isSelected()) {
	    element.click();
	}
    }

    public static void clickCLASS(String CLASS) {
	WebElement element;
	element = driver.findElement(By.xpath(CLASS));
	if (!element.isSelected()) {
	    element.click();
	}
    }

    public static void clickLINK(String LINKTEXT) {
	WebElement element;
	element = driver.findElement(By.linkText(LINKTEXT));
	if (!element.isSelected()) {
	    element.click();
	}
    }

    public static void clickID(String ID) {
	WebElement element;
	element = driver.findElement(By.id(ID));
	if (!element.isSelected()) {
	    element.click();
	}
    }

    public static void clickNAME(String NAME) {
	WebElement element;
	element = driver.findElement(By.name(NAME));
	if (!element.isSelected()) {
	    element.click();
	}
    }

    public static void clickMultipleXPATH(String XPATH, String jsonValues[]) throws InterruptedException {
	String[] stringList = jsonValues;
	for (int i = 0; i < stringList.length; i++) {
	    String clickMultiple = XPATH + stringList[i] + "')]";
	    clickXPATH(clickMultiple);
	}
    }

    public static boolean isDisplayedLINK(String LINKTEXT) {
	WebElement element;
	element = driver.findElement(By.linkText(LINKTEXT));
	return element.isDisplayed();
    }

    public static boolean isDisplayedNAME(String NAME) {
	WebElement element;
	element = driver.findElement(By.name(NAME));
	return element.isDisplayed();
    }

    public static boolean isDisplayedXPATH(String XPATH) {
	WebElement element;
	try {
	    element = driver.findElement(By.xpath(XPATH));
	    return element.isDisplayed();
	} catch (Exception e) {
	    return false;
	}
    }

    public static boolean isDisplayedID(String ID) {
	WebElement element;
	try {
	    element = driver.findElement(By.id(ID));
	    return element.isDisplayed();
	} catch (Exception e) {
	    return false;
	}
    }

    public static boolean isDisplayedCLASS(String CLASS) {
	WebElement element;
	element = driver.findElement(By.className(CLASS));
	return element.isDisplayed();
    }

    public static boolean isExistingXPATH(String XPATH) {
	if (driver.findElements(By.xpath(XPATH)).size() > 0) {
	    return true;
	} else {
	    return false;
	}
    }

    public static boolean isExistingID(String ID) {
	if (driver.findElements(By.id(ID)).size() > 0) {
	    return true;
	} else {
	    return false;
	}
    }

    public static boolean isExistingNAME(String Name) {
	if (driver.findElements(By.name(Name)).size() > 0) {
	    return true;
	} else {
	    return false;
	}
    }

    public static boolean isEnabledXPATH(String XPATH) {
	WebElement element;
	element = driver.findElement(By.xpath(XPATH));
	return element.isEnabled();
    }

    public static boolean isSelectedXPATH(String XPATH) {
	WebElement element;
	element = driver.findElement(By.xpath(XPATH));
	return element.isSelected();
    }

    public static String getTextXPATH(String XPATH) {
	String text = driver.findElement(By.xpath(XPATH)).getText();
	return text;
    }

    public static String getTextID(String ID) {
	String text = driver.findElement(By.id(ID)).getText();
	return text;
    }

    public static String getTextCLASS(String CLASSNAME) {
	String text = driver.findElement(By.className(CLASSNAME)).getText();
	return text;
    }

    public static String getAttributeXPATH(String XPATH) {
	String attribute = driver.findElement(By.xpath(XPATH)).getAttribute("value");
	return attribute;
    }
    
    public static String getAttributeID(String ID) {
  	String attribute = driver.findElement(By.id(ID)).getAttribute("value");
  	return attribute;
      }

    public static int selectSize(String XPATH) {
	Select select = new Select(driver.findElement(By.xpath(XPATH)));
	List<WebElement> selectOptions = select.getOptions();
	return selectOptions.size();
    }

    public static void selectByValueXPATH(String XPATH, String Value) {
	Select select = new Select(driver.findElement(By.xpath(XPATH)));
	select.selectByValue(Value);
    }

    public static void selectByIndexXPATH(String XPATH, Integer Index) {
	Select select = new Select(driver.findElement(By.xpath(XPATH)));
	select.selectByIndex(Index);
    }

    public static void selectByValueNAME(String NAME, String Text) {
	Select select = new Select(driver.findElement(By.name(NAME)));
	select.selectByValue(Text);
    }

    public static void selectByVisibleTextXPATH(String XPATH, String Text) {
	Select select = new Select(driver.findElement(By.xpath(XPATH)));
	select.selectByVisibleText(Text);
    }

    public static void selectByVisibleTextNAME(String NAME, String Text) {
	Select absence = new Select(driver.findElement(By.name(NAME)));
	absence.selectByVisibleText(Text);
    }

    public static void selectMultipleByVisibleTextNAME(String NANE, String jsonValues) {
	String[] stringList = jsonValues.split(",");
	for (int i = 0; i < stringList.length; i++) {
	    /** Add Bid - Consecutive - Range of Dates Calendar- XPATH */
	    selectByVisibleTextNAME(NANE, stringList[i]);
	}
    }

    public static void selectMultipleByVisibleTextXPATH(String XPATH, String jsonValues) {
	String[] stringList = jsonValues.split(",");
	for (int i = 0; i < stringList.length; i++) {
	    /** Add Bid - Consecutive - Range of Dates Calendar- XPATH */
	    selectByVisibleTextXPATH(XPATH, stringList[i]);
	}
    }

    public static boolean checkTextInListXPATH(String XPATH, String text) {
	Select select = new Select(driver.findElement(By.xpath(XPATH)));
	boolean flag = false;
	for (int i = 0; i < select.getOptions().size(); i++) {
	    if (select.getOptions().get(i).getText().equals(text)) {
		flag = true;
	    }
	}
	return flag;
    }

    public static void sendKeysXPATH(String XPATH, String text) {
	WebElement element = driver.findElement(By.xpath(XPATH));
	element.click();
	element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	element.sendKeys(Keys.DELETE);
	element.sendKeys(text);
    }

    public static void sendKeys(String XPATH, Keys keys) {
	WebElement element = driver.findElement(By.xpath(XPATH));
	element.click();
	element.sendKeys(keys);
    }

    public static void sendKeysChord(String XPATH, String keys, String value) {
	WebElement element = driver.findElement(By.xpath(XPATH));
	element.click();
	element.sendKeys(keys, value);
    }

    public static void sendKeysID(String ID, String text) {
	WebElement element = driver.findElement(By.id(ID));
	element.click();
	element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	element.sendKeys(Keys.DELETE);
	element.sendKeys(text);
    }

    public static void sendKeysNAME(String NAME, String Text) {
	WebElement element = driver.findElement(By.name(NAME));
	element.click();
	element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	element.sendKeys(Keys.DELETE);
	element.sendKeys(Text);
    }

    public static String getTextByLink(String LinkText) {
	String infoT = driver.findElement(By.linkText(LinkText)).getText();
	return infoT;
    }

    public static String getCssValueXPATH(String XPATH) {
	String attribute = driver.findElement(By.xpath(XPATH)).getCssValue("background-color");
	return attribute;
    }

    public static String getSpecialAttributeXPATH(String XPATH, String attribute) {
	String attributeValue = driver.findElement(By.xpath(XPATH)).getAttribute(attribute);
	return attributeValue;
    }

    public static String getSpecialAttributeID(String ID, String attribute) {
	String attributeValue = driver.findElement(By.id(ID)).getAttribute(attribute);
	return attributeValue;
    }

    public static String getSpecialCssValueXPATH(String XPATH, String attribute) {
	String cssValue = driver.findElement(By.xpath(XPATH)).getCssValue(attribute);
	return cssValue;
    }

    public static String getSpecialAttributeLINK(String LINKTEXT, String attribute) {
	String attributeValue = driver.findElement(By.linkText(LINKTEXT)).getAttribute(attribute);
	return attributeValue;
    }

    /**
     * To get text value inside a textbox
     * 
     * @throws IOException
     * @throws UnsupportedFlavorException
     */
    public static String getValuesXPATH(String XPATH) throws UnsupportedFlavorException, IOException {
	WebElement element;
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

    /** Clear element values - XPATH */
    public static void clearXPATH(String XPATH) {
	WebElement element;
	element = driver.findElement(By.xpath(XPATH));
	element.clear();
    }

    public static void waitBrowser() throws InterruptedException {
	if (Browser.contains("IE")) {
	    Thread.sleep(2500);
	} else {
	    Thread.sleep(1500);
	}
    }

    public static void waitBrowser(int time) throws InterruptedException {
	if (Browser.contains("IE")) {
	    Thread.sleep(time + 1000);
	} else {
	    Thread.sleep(time);
	}
    }

    public static void closeExportWindow() throws InterruptedException {
	waitBrowser();
	do {
	    screen.mouseMove(100, 100);
	    screen.doubleClick();
	    screen.keyDown(Key.ALT);
	    screen.type(Key.F4);
	    screen.keyUp(Key.ALT);
	    Thread.sleep(1500);
	} while (driver.getWindowHandles().size() > 1);
    }

    /** Convert Month Name in three characters to Integer String */
    public static String monthNameToIntegerString(String monthName) {
	Date date = null;
	try {
	    date = new SimpleDateFormat("MMM").parse(monthName);
	} catch (ParseException e) {
	    e.printStackTrace();
	}
	Calendar cal = Calendar.getInstance();
	cal.setTime(date);
	int month = cal.get(Calendar.MONTH) + 1;
	if (month < 10) {
	    return "0" + String.valueOf(month);
	} else {
	    return String.valueOf(month);
	}
    }

    /**
     * Convert Integer to Month Name in three characters
     * 
     * @throws ParseException
     */
    public static String integerToMonthName(int month) throws ParseException {
	SimpleDateFormat monthParse = new SimpleDateFormat("MM");
	SimpleDateFormat monthDisplay = new SimpleDateFormat("MMM");
	if (month > 12) {
	    month = month % 12;
	}
	return monthDisplay.format(monthParse.parse(String.valueOf(month)));
    }

    public static String getMonthFullNameForInt(int num) {
	DateFormatSymbols dfs = new DateFormatSymbols();
	String[] months = dfs.getMonths();
	if (num >= 0 && num <= 11) {
	    return months[num];
	} else {
	    return "";
	}
    }

    public static void sendKeysNAME_NewDriver(String NAME, String Text) {
	WebElement element = newdriver.findElement(By.name(NAME));
	element.click();
	element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	element.sendKeys(Keys.DELETE);
	element.sendKeys(Text);
    }

    public static void selectByValueNAME_NewDriver(String NAME, String Text) {
	Select select = new Select(newdriver.findElement(By.name(NAME)));
	select.selectByValue(Text);
    }

    public static void clickNAME_NewDriver(String NAME) {
	WebElement element;
	element = newdriver.findElement(By.name(NAME));
	if (!element.isSelected()) {
	    element.click();
	}
    }

    public static void clickXPATH_NewDriver(String XPATH) {
	WebElement element;
	element = newdriver.findElement(By.xpath(XPATH));
	if (!element.isSelected()) {
	    element.click();
	}
    }

    public static void sendKeysXPATH_NewDriver(String XPATH, String text) {
	WebElement element = newdriver.findElement(By.xpath(XPATH));
	element.click();
	element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	element.sendKeys(Keys.DELETE);
	element.sendKeys(text);
    }

    public static String alert_Text_NewDriver() {
	try {
	    WebDriverWait wait = new WebDriverWait(newdriver, 30);
	    wait.until(ExpectedConditions.alertIsPresent());
	    alert = newdriver.switchTo().alert();
	    AlertString = alert.getText();

	} catch (Exception e) {
	    e.printStackTrace();
	}
	return AlertString;
    }

    public static void alert_accept_NewDriver() {
	alert = newdriver.switchTo().alert();
	alert.accept();
    }

    public static String getSpecialAttributeXPATH_NewDriver(String XPATH, String attribute) {
	String attributeValue = newdriver.findElement(By.xpath(XPATH)).getAttribute(attribute);
	return attributeValue;
    }

    public static void sendKeysID_NewDriver(String ID, String text) {
	WebElement element = newdriver.findElement(By.id(ID));
	element.click();
	element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	element.sendKeys(Keys.DELETE);
	element.sendKeys(text);
    }

    public static void selectByVisibleTextNAME_NewDriver(String NAME, String Text) {
	Select absence = new Select(newdriver.findElement(By.name(NAME)));
	absence.selectByVisibleText(Text);
    }

    public static String getTextXPATH_NewDriver(String XPATH) {
	String text = newdriver.findElement(By.xpath(XPATH)).getText();
	return text;
    }

    public static boolean isDisplayedXPATH_NewDriver(String XPATH) {
	WebElement element;
	try {
	    element = newdriver.findElement(By.xpath(XPATH));
	    return element.isDisplayed();
	} catch (Exception e) {
	    return false;
	}
    }
    
    public static void getExceptionErrorMessage(Exception e) {
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(baos);
	e.printStackTrace(ps);
	ps.close();
	test_status = false;
	TestResult = baos.toString();
}

    public static void clickID_NewDriver(String ID) {
	WebElement element;
	element = newdriver.findElement(By.id(ID));
	if (!element.isSelected()) {
	    element.click();
	}
    }

    public static void clickLINK_NewDriver(String LINKTEXT) {
	WebElement element;
	element = newdriver.findElement(By.linkText(LINKTEXT));
	if (!element.isSelected()) {
	    element.click();
	}
    }

    public static boolean isEnabledXPATH_NewDriver(String XPATH) {
	WebElement element;
	element = newdriver.findElement(By.xpath(XPATH));
	return element.isEnabled();
    }

    /**
     * Pad characters (fox example "0") before a string to form a special length
     * string
     **/
    public static String padBeforeString(String stringToBePad, String padString, int length) {
	boolean flag = false;
	while (stringToBePad.length() < length) {
	    stringToBePad = padString + stringToBePad;
	    flag = true;
	}
	if (flag) {
	    stringToBePad = stringToBePad.substring(stringToBePad.length() - length);
	}
	return stringToBePad;
    }

    public static void actionClickXPATH(String XPATH) {
	Actions action = new Actions(driver);
	action.click(driver.findElement(By.xpath(XPATH))).perform();
    }

    public static boolean checkboxOnXPATH(String xpath) {
	if (getSpecialAttributeXPATH(xpath, "src").contains("check_on")) {
	    return true;
	} else {
	    return false;
	}
    }
}
