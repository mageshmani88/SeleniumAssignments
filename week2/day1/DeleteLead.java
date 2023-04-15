package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
	
public static void main(String[] args) throws Exception {
        
		ChromeDriver driver = new ChromeDriver();
        
        // Navigate to the CRM/SFA system
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        // Enter the username and password
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("DemoSalesManager");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("crmsfa");
        
        // Click on the Login button
        WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
        loginButton.click();
        
        WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
        crmsfa.click();
        
        // Click on the Leads link
        WebElement leadsLink = driver.findElement(By.linkText("Leads"));
        leadsLink.click();
        
        // Click on the Find leads button
        WebElement findLeadsButton = driver.findElement(By.linkText("Find Leads"));
        findLeadsButton.click();
        
       // Select the Phone option and enter the phone number
        WebElement phoneOption = driver.findElement(By.xpath("//span[text()='Phone']"));
        phoneOption.click();
        
        WebElement phonecountrycode = driver.findElement(By.name("phoneCountryCode"));
        phonecountrycode.clear();
        
        WebElement entercountrycode = driver.findElement(By.name("phoneCountryCode"));
        entercountrycode.sendKeys("91");
        
        WebElement phonenumber = driver.findElement(By.name("phoneNumber"));
        phonenumber.sendKeys("9677231363");
        
        WebElement clickfindlead = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        clickfindlead.click();
        
        Thread.sleep(5000);
        
        // Click on the Find leads button and capture the lead ID of the first resulting lead
        
        WebElement firstLead = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]"));
        String leadId = firstLead.getText();
        System.out.println(leadId);
                
        firstLead.click();
        
       
        
        // Click on the first resulting lead and then click on the Delete button
        
        WebElement deleteButton = driver.findElement(By.xpath("//a[text()='Delete']"));
        deleteButton.click();
        
        //Confirm the deletion of the Find leads button
        
        WebElement findleads = driver.findElement(By.xpath("//a[text()='Find Leads']"));
        findleads.click();
        
        WebElement capturedleadID = driver.findElement(By.xpath("//input[@name='id']"));
        capturedleadID.sendKeys(leadId);
        
        WebElement findleadbutton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        findleadbutton.click();
        
        // Verify the message "No records to display"
        
        WebElement deletemessage = driver.findElement(By.xpath("//div[text()='No records to display']"));
        String deletemessageText = deletemessage.getText();
        if (deletemessageText.equals("No records to display")) {
            System.out.println(leadId + " is deleted successfully");
        } else {
            System.out.println("Still Lead needs to delete");
        }
        
        // Close the browser
        //driver.close();
    }

}
