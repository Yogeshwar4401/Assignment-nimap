package nimapinfotech.nimapinfotech.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomer {
	
        public static void main (String [] args) {
        	
        	 WebDriver driver = new ChromeDriver();
             
        	    driver.get("https://testffc.nimapinfotech.com/customers");
        	    
        	    driver.findElement(By.xpath("//span[text()=' New Customer ']")).click();
        	    
        	    driver.findElement(By.xpath("//input[@formcontrolname='LeadName']")).sendKeys("Yogeshwar Tatkundwar");

        	    
		}

}
