package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

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
		
		WebElement firstnamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstnamelocal.sendKeys("Magesh");
		
		WebElement department = driver.findElement(By.id("createLeadForm_dataSourceId"));
		department.sendKeys("Conference");
		
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Lead is creating via automation tool");
		
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("mageshmani8588@gmail.com");
		
		WebElement stateprovince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select sp = new Select(stateprovince);
		
		sp.selectByVisibleText("New York");
		
		WebElement creatlead = driver.findElement(By.className("smallSubmit"));
		creatlead.click();
		
		System.out.println("Title of the Resulting Page is : " + driver.getTitle());
		
		WebElement duplicatelead = driver.findElement(By.linkText("Duplicate Lead"));
		duplicatelead.click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		WebElement clearingcompanyname = driver.findElement(By.id("createLeadForm_companyName"));
		clearingcompanyname.sendKeys("MS Software Tech Solutions");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
				
		WebElement clearingleadfirstname = driver.findElement(By.id("createLeadForm_firstName"));
		clearingleadfirstname.sendKeys("Mithran");
		
		WebElement duplicatecreatlead = driver.findElement(By.className("smallSubmit"));
		duplicatecreatlead.click();
		
		System.out.println("Title of the Resulting Page is : " + driver.getTitle());

		

		


	}

}
