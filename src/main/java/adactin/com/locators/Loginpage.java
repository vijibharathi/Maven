package adactin.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.com.baseclass.Baseclass;

public class Loginpage extends Baseclass {
	
	
	public Loginpage(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="img[src='img/AdactIn_logo.png']")
     public WebElement LogoDisplay;
	
	@FindBy(id="username")
	public WebElement Username;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(id="login")
	public WebElement Login;
}
