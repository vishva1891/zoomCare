package config;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;

import commons.Commons;

public class JsonData extends Commons {
    /** JSON Connection */
    public static JSONParser jsonParser = null;
    public static JSONObject jsonObject = null;
    public static JSONObject dict = null;
    public static JSONArray scenarioList = null;
    public static JSONArray testArray = null;
    public static JSONParser testParser = null;
    public static JSONObject testObject = null;

    /** Browser which will be used for testing -- Json Value */
    public static String Browser;

    /** Test Scenario -- Json Value */
    public static String Scenario;

    /** Test Run ID - TestRail */
    public static int runID;

    /** userName */
    public static String userName;

    /** userName */
    public static String userPass;

    /** userName */
    public static String airline;

    /** Project ID from test management tool */
    public static int projectID;

    /** SpiraTest UserName */
    public static String spiraUser;

    /** NAVBLUE LDAP PassWord */
    public static String NAV_Pass;

    /** NAVBLUE E-mail */
    public static String email;

    /** Version number of PBS System */
    public static String version;

    /** Case ID from Spira Test Management Tool */
    public static int caseID;

    /** Test Case title from Spira Test Management Tool */
    public static String title;

    /** Expected Result */
    public static String expectedResult;

    /** Test Actions */
    public static String scenario;

    /** Test Suite */
    public static String suite;

    public static void jsonScenario() {
	try {
	    /* Gets JSON Test Data path */
	    File testFile = FileHelper.fileHelper("/TestData/Scenarios.json");
	    String filePath = testFile.getAbsolutePath();
	    /* Reads Test Data */
	    FileReader reader = new FileReader(filePath);
	    jsonParser = new JSONParser();
	    jsonObject = (JSONObject) jsonParser.parse(reader);
	    scenarioList = (JSONArray) jsonObject.get("Scenarios");
	    Browser = (String) jsonObject.get("Browser");
	    userName = (String) jsonObject.get("userName");
	    userPass = (String) jsonObject.get("userPass");
	    airline = (String) jsonObject.get("airline");
	    projectID = (int) (long) jsonObject.get("projectID");
	    spiraUser = (String) jsonObject.get("spiraUser");
	    NAV_Pass = (String) jsonObject.get("NAV_Pass");
	    email = (String) jsonObject.get("email");
	    runID = (int) (long) jsonObject.get("runID");
	    version = (String) jsonObject.get("version");
	    suite = (String) jsonObject.get("suite");
	} catch (Exception e) {
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    e.printStackTrace(ps);
	    ps.close();
	    System.out.println(baos.toString());
	    Assert.assertFalse(true);
		}
    }

    public static void jsonTest() {
	try {
	    File testFile = FileHelper.fileHelper("/TestData/" + Scenario + ".json");
	    String testFilePath = testFile.getAbsolutePath();
	    FileReader testReader = new FileReader(testFilePath);
	    testParser = new JSONParser();
	    testObject = (JSONObject) testParser.parse(testReader);
	    testArray = (JSONArray) testObject.get(Scenario);
	} catch (Exception e) {
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    e.printStackTrace(ps);
	    ps.close();
	    Assert.assertFalse(true);
		}
    }
}
