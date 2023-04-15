package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
	        
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Enter UserName and Password Using Id Locator
        
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		
        //Click on Login Button using Class Locator
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        //Click on CRM/SFA Link
        
        driver.findElement(By.linkText("CRM/SFA")).click();

		//Click on contacts Button
        
        driver.findElement(By.linkText("Contacts")).click();

		//Click on Create Contact

        driver.findElement(By.linkText("Create Contact")).click();
        
		//Enter FirstName Field Using id Locator
        
        driver.findElement(By.id("firstNameField")).sendKeys("Magesh");

		//Enter LastName Field Using id Locator
        
        driver.findElement(By.id("lastNameField")).sendKeys("Mani");
        

		//Enter FirstName(Local) Field Using id Locator
        
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mithran");

		//Enter LastName(Local) Field Using id Locator
        
        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Magesh");

		//Enter Department Field Using any Locator of Your Choice
        
        driver.findElement(By.xpath("//input[@class='inputBox' and @name='departmentName']")).sendKeys("Salesforce QA");

		//Enter Description Field Using any Locator of your choice 
        
        driver.findElement(By.id("createContactForm_description")).sendKeys("Creating Contact using Automation");

		//Enter your email in the E-mail address Field using the locator of your choice
        
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mageshmani8588@gmail.com");

		//Select State/Province as NewYork Using Visible Text
        
        //dropdown = Select(browser.find_element_by_id("state_dropdown"))
   		//dropdown.select_by_visible_text("New York")
        
        WebElement dropdownstate = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        
        Select stateSelect = new Select(dropdownstate);
        stateSelect.selectByVisibleText("New York");

		//Click on Create Contact
        
        driver.findElement(By.className("smallSubmit")).click();

		//Click on edit button 
        
        driver.findElement(By.linkText("Edit")).click();
        
		//Clear the Description Field using .clear
        
        driver.findElement(By.id("updateContactForm_description")).clear();

		//Fill ImportantNote Field with Any text
        
        driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Updating Important Note");

		//Click on update button using Xpath locator
        
        driver.findElement(By.xpath("//input[@value='Update']")).click();

		//Get the Title of Resulting Page
        
        String pagetitle = driver.getTitle();
        System.out.println("Webpage title of this page is: " + pagetitle);
	        
	}

}
