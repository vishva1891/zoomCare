package commons;

public class Buttons extends Commons {

    /** Main Page List Button - ID */
    public static final String LIST = "btnList";

    /** Main Page Plan Button - ID */
    public static final String PLAN = "btnPlan";

    /** Main Page Route Button - ID */
    public static final String ROUTE = "btnRoute";

    /** Main Page Automation Button - ID */
    public static final String AUTOMATION = "btnAutomation";

    /** Main Page Reports Button - ID */
    public static final String REPORTS = "btnReports";

    /** Main Page Progress Button - ID */
    public static final String PROGRESS = "btnProgress";
    
    /** Main Page Progress Disabled Button - ID */
    public static final String PROGRESS_DISABLED = "DisabledLinkButton";

    /** Main Page Settings Button - ID */
    public static final String SETTINGS = "btnSettings";

    /** Main Page Alerts Button - ID */
    public static final String ALERTS = "btnAlerts";

    /** Main Page Maintenance Button - ID */
    public static final String MAINTENANCE = "btnMaintenance";

    /** Main Page Helps Button - ID */
    public static final String HELP = "btnHelp";

    /** Main Page Logout Button - XPATH */
    public static final String LOGOUT = "//a[contains(@id,'loginStatus')]";

    /** Main Page Expand Button - ID */
    public static final String EXPAND = "btnExpandFlights";
    
    /** Main Page Profile Dropdown - ID */
    public static final String PROFILE_DROPDOWN = "lstExpandedProfileName";
    
    /** Main Page T/O Button - ID */
    public static final String TO = "txtExpandedTOAlt";
    
    /** Main Page First Dropdown - ID */
    public static final String FIRST = "cboExpandedAlt1";
    
    /** Main Page Second Dropdown - ID */
    public static final String SECOND = "cboExpandedAlt2";
    
    /** Main Page Third Dropdown - ID */
    public static final String THIRD = "cboExpandedAlt3";
    
    /** Main Page Fourth Dropdown - ID */
    public static final String FOURTH = "cboExpandedAlt4";
    
    /** Main Page Cargo - ID */
    public static final String CARGO = "txtExpandedCgo";
    
    /** Main Page Paylod - ID */
    public static final String PAYLOAD = "txtExpandedPld";
    
    /** Main Page MLF Button - ID */
    public static final String MFL = "txtExpandedMaxFlightLevel";
    
    /** Main Page Cargo - ID */
    public static final String CIRCUIT_ONE = "txtExpandedCot";
    
    /** Main Page Paylod - ID */
    public static final String CIRCUIT_TWO = "txtExpandedCdt";
    
    /** Main Page MLF Button - ID */
    public static final String ADDITIONAL = "txtExpandedAddn";
    
    /** Main Page MLF Button - ID */
    public static final String AIRCRAFT = "cboExpandedAircraftId";
    
    /** Main Page Tankerage Button - ID */
    public static final String TANKERAGE = "txtExpandedTankerage";
    
    /** Main Page Compute Button - ID */
    public static final String COMPUTE_SYMBOL = "imgExpandedFlightEditCompute";
    
    /** Main Page Destination - ID */
    public static final String DESTINATION = "txtExpandedDestination";
    
    /** Main Page ETD - ID */
    public static final String ETD = "txtExpandedEtd";
    
    /** Main Page STA - ID */
    public static final String STA = "txtExpandedSta";
    
    /** Main Page ATL ALC - ID */
    public static final String ATCALC = "txtExpandedAtcAlc";
    
    /** Main Page Route - NAME */
    public static final String ROUTE_EXPAND = "lstExpandedRoute";
    
    /** Main Page Adults - ID */
    public static final String ADULTS = "txtExpandedAdults";
    
    /** Main Page Children - ID */
    public static final String CHILDREN = "txtExpandedChildren";
    
    /** Main Page Oew - ID */
    public static final String OEW = "txtExpandedOew";
    
    /** Main Page Hold - ID */
    public static final String HOLD = "txtExpandedFuelHold1";
    
    /** Main Page ATL ALC - ID */
    public static final String SECONDHOLD = "txtExpandedFuelHold2";
    
    /** Main Page CPT - NAME */
    public static final String CPT = "cboExpandedCpt";
    
    /** Main Page FO - NAME */
    public static final String FO = "cboExpandedFO";
    
    /** Main Page FA - NAME */
    public static final String FA = "cboExpandedFA";
    
    /** Main Page FE - NAME */
    public static final String FE = "cboExpandedFE";
    
    /** Main Page DXR - NAME */
    public static final String DXR = "cboExpandedDXR";
    
    
    
    
    
    
    
    /**  ==================================   Plan Page Buttons =======================================================================  */
    
    /** Plan Page - Clear Button - ID */
    public static final String CLEAR_BUTTON = "btnClear";
    
    /** Plan Page - Clear Button - ID */
    public static final String CLEAR = "//div[@class='el-popup']//span[contains(text(),'Clear')]";
    
    /** Plan Page - Refresh Button - ID */
    public static final String REFRESH_BUTTON = "btnRefresh";
    
    /** Plan Page - Refresh Button - ID */
    public static final String REFRESH_BUTTON_ALERTSPAGE= "//span[contains(text(),'Refresh')]";
    
    /** Plan Page - Save SnapShot Button - ID */
    public static final String SAVE_SNAPSHOT_BUTTON = "btnSaveSnapshot";
    
    /** Plan Page - Load SnapShot Button - ID */
    public static final String LOAD_SNAPSHOT_BUTTON = "btnLoadSnapshot";
    
    /** Plan Page - Load  Button - ID */
    public static final String LOAD_BUTTON = "btnRecallLoad";
    
    /** Plan Page -Template Button - ID */
    public static final String TEMPLATE_BUTTON = "btnTemplateDialog";
    
    /** Plan Page -Compute Button - ID */
    public static final String COMPUTE_BUTTON = "btnCompute";
    
    /** Plan Page -RWA Button - ID */
    public static final String RWA_BUTTON = "btnRunwayAnalysis";
    
    /** Plan Page -Revisions Button - ID */
    public static final String REVISIONS_BUTTON = "btnOpenRecallDialog";
    
    /** Plan Page -Show failed computes - ID */
    public static final String SHOW_FAILED_COMPUTES = "chkShowFailed";
    
    /** Plan Page -Revisions Box Cancel  - ID */
    public static final String REVISIONS_CANCELBUTTON = "btnRecallCancel";
    
    /** Plan Page -Revisions Button - ID */
    public static final String REVISIONS= "//tr[contains(@id,'recallList_1')]/td[1]";
    
    /** Plan Page -Revisions Button - ID */
    public static final String COMPUTE_ICON= "//img[contains(@src,'img/FlightComputed.png')]";
    
    /** Plan Page -Clone(Ghost) Button - ID */
    public static final String CLONE_GHOST_BUTTON = "btnCloneToGhost";
    
    /** Plan Page -Clone Button - ID */
    public static final String CLONE_BUTTON = "btnCloneToTest";
    
    /** Plan Page - Fuel Extend Button - ID */
    public static final String FUEL_EXTEND_BUTTON = "fuelGroupBoxButton";
    
    /** Plan Page -Fuel Close Button - ID */
    public static final String FUEL_CLOSE_BUTTON = "fuelGroupBoxButton";
    		
    /** Plan Page - Alternates Extend Button - ID */
    public static final String ALTERNATES_EXTEND_BUTTON = "alternatesGroupBoxButton";
    
    /** Plan Page -Alternates Close Button - ID */
    public static final String ALTERNATES_CLOSE_BUTTON = "alternatesGroupBoxButton";
    		
    /** Plan Page -Diverted Icon - XPATH */
    public static final String DIVERTED_ICON = "//img[contains(@src,'img/FlightDiverted.png')]";
    
    
    /**  =============================================================================================================================  */
    
    /** Apply button - XPATH */
    public static final String APPLY = "//input[contains(@value,'Apply')]";
    
    /** Reset button - XPATH */
    public static final String RESET = "//input[contains(@value,'Reset')]";
    
    /**  =============================================================================================================================  */
    
    /** Change Password button - NAME */
    public static final String CHANGE_PASSWORD_BUTTON = "ChangePasswordButton";
    
    /** Cancel button - ID */
    public static final String CANCNEL_BUTTON = "CancelButton";
    
   
    /** Save Map button */
     public static final String SAVE_MAP_BUTTON = "btnSaveMapImage";
     
     /**Save button*/
     public static final String SAVE = "//input[contains(@value,'Save')]";
     
     /**Cancel button*/
     public static final String CANCEL = "//input[contains(@value,'Cancel')]";
     
     /**OK button*/
     public static final String OK_BUTTON  = "//input[contains(@value,'OK')]";
     
     /**New button*/
     public static final String NEW_BUTTON  = "//button[contains(text(),'New')]";
     
     /**Edit button*/
     public static final String EDIT_BUTTON  = "//button[contains(text(),'Edit')]";
     
     /**Save button*/
     public static final String SAVE_BUTTON  = "//button[contains(text(),'Save')]";
     
     /**Delete button*/
     public static final String DELETE_BUTTON  = "//input[contains(@id,'btnDeleteFlights')]";
     
     /**Delete button*/
     public static final String DELETE_FLIGHTS  = "//input[contains(@id,'btnDeleteFlightsDelete')]";
     
       
}
