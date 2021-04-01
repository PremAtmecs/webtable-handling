package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Spreadsheet.Testdata;
import Webtableslocator.Inspectlocators;

public class Heading {
 
	Testdata test; 
	Inspectlocators inspect;
	
	public Heading() throws Exception
	{
		test = new Testdata();
		inspect = new Inspectlocators();
		this.test = test;
		this.inspect = inspect;
	}
	
	public void validateFirstname(WebDriver driver)
	{
		
		String a = test.getColHead();
		By b = inspect.getFirstName();
	String c = 	driver.findElement(b).getText();
	 
	if(a.equalsIgnoreCase(c))
	{
		System.out.println("matching name is"+a);
		
	}
	else
	{
	System.out.println("wrong element");	
	}
		
	
}
}
