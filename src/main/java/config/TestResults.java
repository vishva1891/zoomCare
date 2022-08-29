package config;

import java.io.IOException;
import java.util.Date;

import com.aventstack.extentreports.Status;

import commons.Commons;
import commons.ScreenShot;

public class TestResults extends Commons {
    public static void testResults()
	    throws IOException {
	try {
	    Date now = new Date();
	    Integer testerUserId = 5;
	    int testCaseId = JsonData.caseID;
	    Integer releaseId = null;
	    Integer testSetId = JsonData.runID;
	    Date startDate = now;
	    Date endDate = now;
	    int executionStatusId = 1;
	    if (result.getFailureCount() == 0) {
		if (TestResult == null) {
		    executionStatusId = 5;
		    TestResult = "Test is blocked";
		    System.out.println("Test is blocked");
		    ScreenShot.scrFile = null;
		    test.log(Status.SKIP, TestResult);
		} else {
		    executionStatusId = 2;
		    System.out.println("\nPassed\n");
		    ScreenShot.scrFile = null;
		    test.log(Status.PASS, TestResult);
		}
	    } else {
		System.out.println("\nFailed\n");
		test.log(Status.FAIL, TestResult);
		test.addScreenCaptureFromPath(JsonData.suite + "-" + JsonData.title + ".png");
	    }
	    String runnerName = "JUnit";
	    String runnerStackTrace = TestResult;
	    String runnerMessage = null;
	    int runnerAssertCount = 0;
	    String runnerTestName = null;
	    
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    extent.flush();
	}
    }
}
