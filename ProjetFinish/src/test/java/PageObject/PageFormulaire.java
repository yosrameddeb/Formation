package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFormulaire {


	WebDriver driver;	

	//creation des constructeur

	//identification des elements
	
	@FindBy(how =How.ID, using = "id_gender2")
	public static WebElement Bt_tittle;
	
	@FindBy(how =How.XPATH, using = "//input[@id='password']")
	public static WebElement Pass;
	
	@FindBy(how =How.XPATH, using = "//select[@id='days']")
	public static WebElement Day;
	
	@FindBy(how =How.XPATH, using = "//select[@id='months']")
	public static WebElement Mounth;

	@FindBy(how =How.XPATH, using = "//select[@id='years']")
	public static WebElement Year;
	
	@FindBy(how =How.ID, using = "newsletter")
	public static WebElement Newsletter;
	
	@FindBy(how =How.ID, using = "optin")
	public static WebElement Offer;
	
	@FindBy(how =How.NAME, using = "first_name")
	public static WebElement First_Name;
	
	@FindBy(how =How.NAME, using = "last_name")
	public static WebElement Last_Name;
	
	@FindBy(how =How.NAME, using = "company")
	public static WebElement Company;
	
	@FindBy(how =How.NAME, using = "address1")
	public static WebElement Adress1;
	
	@FindBy(how =How.NAME, using = "address2")
	public static WebElement Adress2 ;
	
	@FindBy(how =How.NAME, using = "country")
	public static WebElement Country ;
	
	@FindBy(how =How.NAME, using = "state")
	public static WebElement State ;
	
	@FindBy(how =How.NAME, using = "city")
	public static WebElement City ;
	
	@FindBy(how =How.NAME, using = "zipcode")
	public static WebElement Zipcode ;
	
	@FindBy(how =How.ID, using = "mobile_number")
	public static WebElement Mobile_Number;
	
	
	@FindBy(how =How.XPATH, using = "//button[normalize-space()='Create Account']")
	public static WebElement Bt_Create_Account;
	
	
	
	}


