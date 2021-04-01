package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Heading;

public class Webtablevalidation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ram.pandi\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/webtables");
		  
		  Heading head = new Heading();
		  head.validateFirstname(driver);
	}

}
