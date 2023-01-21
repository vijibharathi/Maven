package adactin.com.pageofobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import adactin.com.baseclass.Baseclass;
import adactin.com.locators.Loginpage;
import adactin.com.locators.Searchpage;


public class POMclass extends Baseclass {
	
	//public WebDriver driver;
	
	
	public POMclass(WebDriver driver) {
		
		this.driver= driver;
	}
     private Loginpage Loginpage;

	public Loginpage getLoginpage() {
		
		if(Loginpage==null) {
			Loginpage= new Loginpage(driver);
		}
		return Loginpage;
	}
  
	private Searchpage Searchpage;

	public Searchpage getSearchpage() {
		
		if (Searchpage==null) {
			Searchpage=new Searchpage(driver);
		}
		return Searchpage;
	}
	
}
