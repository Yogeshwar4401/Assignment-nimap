package nimapinfotech.nimapinfotech.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	   
		 WebDriver driver;

		    @BeforeMethod
		    public void setUp() {
		           
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://testffc.nimapinfotech.com/auth/login"); 
		    }

		    @DataProvider(name = "loginData")
		    public Object[][] loginData() {
		        return new Object[][] {
		            {"yogeshwar.2155@gmail.com", "yogi@1234"},
		           
		           
		        };
		    }

		    @Test(dataProvider = "loginData")
		    public void loginTest(String username, String password) throws InterruptedException {
		        WebElement usernameField = driver.findElement(By.xpath("//input[@formcontrolname='username']")); 
		        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		        
		        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Sign In']"));

		        usernameField.sendKeys(username);
		        passwordField.sendKeys(password);
		        loginButton.click();
		        
		       
		  
		    }	    
		    

}
