package adactin.com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {
	public static WebDriver driver;
	
	public static WebDriver Browser_Launch(String Browsername) {
		if(Browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Adactin\\src\\test\\resource\\adactin\\com\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (Browsername.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Adactin\\src\\test\\resource\\adactin\\com\\driver\\chromedriver.exe");
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
        return driver;
     }
	public static void getUrl(String value) {
		try {
			driver.get(value);
		} catch(Exception e) {
			System.out.println("Invalid Url"+e.getMessage());
		}
	}
	public static boolean isDisplayed(WebElement element) {
		boolean display=false;
		try {
			display= element.isDisplayed();
		}catch(Exception e) {
			System.out.println("Unable to locate logo"+e.getMessage());

		}
    return display;
   }
	public static  void Clicks(WebElement element) {
       try {
    	   element.click();
       }catch(Exception e) {
    	   System.out.println("Unable to click"+e.getMessage());
       }
	}
	
	public static void Sendkeys(WebElement element,String value) {
try {
	element.sendKeys(value);
}catch(Exception e) {
	System.out.println("Unable to enter value"+e.getMessage());
}
	}
		
	  

}
