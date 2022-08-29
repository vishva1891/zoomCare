package stepDefinition;

import java.io.IOException;
import java.util.Date;

import java.util.concurrent.TimeUnit;

import cucumber.api.Scenario;
import org.json.simple.parser.ParseException;
import com.aventstack.extentreports.Status;
import commons.Commons;
import config.DriverSettings;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.regex.Pattern;

public class CommonStepDefinition extends Commons {

    @When("^open browser$")
    public static void openBrowser() throws Exception {
	DriverSettings.openBrowser();
    }

    @And("^close browser$")
    public static void closeBrowser() {
	driver.close();
    }

    @Before
    public static void before() {
	startTime_case = System.currentTimeMillis();
	TestResult = null;
	test_status = true;
    }

    @After
    public static void after(Scenario scenario) throws IOException, ParseException, InterruptedException {
	if (scenario.getName().replace(" ", "").toLowerCase().contains("openbrowser")
		|| scenario.getName().replace(" ", "").toLowerCase().contains("closebrowser")) {
	    return;
	}
	test = extent.createTest(caseID + ": " + title, title);
	System.out.println(caseID + ":" + title);
	endTime_case = System.currentTimeMillis();
	totalTime_case = endTime_case - startTime_case;
	String resultString = "";
	int executionStatusId = 1;
	String tempResult = TestResult.replace("\n", "<br />");
	try {
	    if (test_status) {
		if (TestResult == null) {
		    executionStatusId = 5;
		    TestResult = "Test is blocked";
		    test.log(Status.SKIP, tempResult);
		    resultString = "ABORTED";
		    System.out.println(TestResult);
		    System.out.println("Blocked");
		} else {
		    executionStatusId = 2;
		    test.log(Status.PASS, tempResult);
		    resultString = "PASS";
		    System.out.println(TestResult);
		    System.out.println("Passed");
		}
	    } else {
		test.log(Status.FAIL, tempResult);
		test.addScreenCaptureFromPath(suite + "-" + caseID + ".png");
		resultString = "FAIL";
		System.out.println(TestResult);
		System.out.println("Failed");
	    }
	    // testResults.getTestRunIdFromJira(JIRA_USERNAME, JIRA_PASSWORD, JIRA_URL,
	    // testExecutionKey, caseID);
	    // testResults.getStepRunIdFromJira(JIRA_USERNAME, JIRA_PASSWORD, JIRA_URL);
	    // testResults.writeTestStepResultToJson(stepId[stepId.length-1], resultString,
	    // testResult, suite + "-" + caseID + ".png");
	    // testResults.updateTestRunStepResult(JIRA_USERNAME, JIRA_PASSWORD, JIRA_URL,
	    // testRunId, stepId[stepId.length-1]);
	    scrFile = null;
	    Date now = new Date();
	    Integer testerUserId = 5;
	    int testCaseId;
	    if (Pattern.matches("\\d+", caseID)) {
		testCaseId = Integer.parseInt(caseID);
	    } else {
		testCaseId = 0;
	    }
	    Integer releaseId = null;
	    Integer testSetId = runID;
	    Date startDate = now;
	    Date endDate = now;
	    String runnerName = "JUnit";
	    String runnerStackTrace = TestResult;
	    String runnerMessage = String.format("Test Execution time: %d min, %d sec \n",
		    TimeUnit.MILLISECONDS.toMinutes(totalTime_case), TimeUnit.MILLISECONDS.toSeconds(totalTime_case)
			    - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(totalTime_case)));
	    int runnerAssertCount = 0;
	    String runnerTestName = title;
	    /*SpiraTestExecute.recordTestRun(testerUserId, testCaseId, releaseId, testSetId, startDate, endDate,
		    executionStatusId, runnerName, runnerTestName, runnerAssertCount, runnerMessage, runnerStackTrace);*/
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    extent.flush();
	}
    }
}