package testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.sikuli.script.ImagePath;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import commons.Commons;
import config.FileHelper;
import config.JsonData;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/main/java/Features" }, glue = { "stepDefinition" }, tags = {
	"@ZoomcareScheducle" }, monochrome = true)

public class TestRunner extends Commons {

    
}
