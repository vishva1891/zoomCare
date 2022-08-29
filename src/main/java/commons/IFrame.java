package commons;

import org.openqa.selenium.By;

public class IFrame extends Commons {

    /** iFrame ID for List */
    public static final String LIST_FRAME = "iframeList";
    /** iFrame ID for Plan */
    public static final String PLAN_FRAME = "iframePlan";
    /** iFrame ID for Route */
    public static final String ROUTE_FRAME = "iframeRoute";
    /** iFrame ID for Automation */
    public static final String AUTOMATION_FRAME = "iframeAutomation";
    /** iFrame ID for Reports */
    public static final String REPORTS_FRAME = "iframeReports";
    /** iFrame ID for Progress */
    public static final String PROGRESS_FRAME = "iframeProgress";
    /** iFrame ID for Settings */
    public static final String SETTINGS_FRAME = "iframeSettings";
    /** iFrame ID for Alerts */
    public static final String ALERTS_FRAME = "iframeAlerts";
    /** iFrame ID for Permit List */
    public static final String MAINTENANCE_FRAME = "iframeMaintenanceWebFoms";
    /** iFrame ID for FOMS Maintainance*/
    public static final String FOMS_MAINTAINANCE= "iframeMaintenanceFomsTerminal";
    
    /** iFrame ID for Automation Default*/
    public static final String AUTOMATION_DEFAULTS_FRAME= "iframeMaintenanceAutomationDefaults";
    
    /** iFrame ID for Permit List */
    public static final String PERMITLIST_FRAME = "iframeMaintenanceFlightPermitList";
    /** iFrame ID for Permit - Country Warnings List */
    public static final String PERMIT_COUNTRY_WARNING_FRAME = "iframeMaintenanceCountryPermitWarningList";
    /** iFrame ID for Missing Permit Report List */
    public static final String MISSING_PERMIT_REPORT_FRAME = "iframeMaintenanceMissingPermitReport";
    /**iFrame locator for NFP Database */
    public static final String NFP_DATABASE_FRAME = "//div[contains(@id,'pnlMainContent')]//iframe";
    

    public static void ID(String ID) throws InterruptedException {
	driver.switchTo().frame(driver.findElement(By.id(ID)));
	Thread.sleep(800);
    }

    public static void XPATH(String XPATH) throws InterruptedException {
	driver.switchTo().frame(driver.findElement(By.xpath(XPATH)));
	Thread.sleep(800);
    }

    public static void NAME(String NAME) throws InterruptedException {
	driver.switchTo().frame(driver.findElement(By.name(NAME)));
	Thread.sleep(800);
    }

    public static void Default() throws InterruptedException {
	driver.switchTo().defaultContent();
	Thread.sleep(800);
    }
}
