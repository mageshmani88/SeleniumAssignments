package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPageTestLeaf {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		
		WebElement leadtab = driver.findElement(By.linkText("Leads"));
		leadtab.click();
		
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("TestLeaf");
		
		
		WebElement leadfirstname = driver.findElement(By.id("createLeadForm_firstName"));
		leadfirstname.sendKeys("Magesh");
		
		WebElement leadlastname = driver.findElement(By.id("createLeadForm_lastName"));
		leadlastname.sendKeys("Mani");
		
		//To select Source dd - direct value
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Conference");
		
		//To select Industry dd - visible text
		
		WebElement dropdownindustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		Select dd = new Select(dropdownindustry);
		
		dd.selectByVisibleText("Computer Hardware");
		
		//To select "Partnership" ownership dd - index
		
		WebElement ownershipindex = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select dd1 = new Select(ownershipindex);
		
		dd1.selectByIndex(2);
		
		//To select Preferred currency - value
		
	    WebElement preferredcurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		
		Select dd2 = new Select(preferredcurrency);
		
		dd2.selectByValue("INR");
		
		
		
		
		//WebElement submitlead = driver.findElement(By.className("smallSubmit"));
		//submitlead.click();
		
		
		

	}

}
