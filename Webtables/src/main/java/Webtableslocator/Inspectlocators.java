package Webtableslocator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class Inspectlocators
{
	public Properties prop;
    public Inspectlocators()
    {
//    	Properties prop = new Properties();
//    	File file = new File(System.getProperty("C:\\Users\\ram.pandi\\eclipse-workspace\\Webtables\\src\\main\\java\\locators.properties"));
//    	
//		try {
//			FileInputStream	fis = new FileInputStream(file);
//			prop.load(fis);
//			this.prop = prop;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
    	Properties prop=new Properties();
    	FileInputStream file=null;
    	try {file = new FileInputStream(System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+"locators.properties");}
    	catch (FileNotFoundException e) {e.printStackTrace();}
    	try {prop.load(file);
    		this.prop=prop;
    	} 
    	catch (IOException e) {e.printStackTrace();}
    	
    }
    
    public By getFirstName()
    {
    	By name = By.xpath(prop.getProperty("firstname"));
    	return name;
    }
    public By getLastName()
    {
    	By name = By.xpath(prop.getProperty("lastname"));
    	return name;
    }
    
    public By age()
    {
    	By name = By.xpath(prop.getProperty("age"));
    	return name;
    }

public By salary()
{
	By name = By.xpath(prop.getProperty("salary"));
	return name;
}
public By action()
{
	By name = By.xpath(prop.getProperty("action"));
	return name;
}
public By email()
{
	By name = By.xpath(prop.getProperty("email"));
	return name;
}
public By department()
{
	By name = By.xpath(prop.getProperty("department"));
	return name;
}

}

