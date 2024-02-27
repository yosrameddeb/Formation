package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageAcceuil {

WebDriver driver;	

//creation des constructeur



//identification des elements

@FindBy(how = How.XPATH , using="//a[normalize-space()='Signup / Login']")
public static WebElement Bt_signupe;

@FindBy(how = How.NAME, using="name")
public static WebElement nom;


@FindBy(how = How.XPATH, using="//input[@data-qa='signup-email']")
public static WebElement mail;

@FindBy (how = How.XPATH, using="//button[normalize-space()='Signup']")
public static WebElement Bt_signupe2;




}



