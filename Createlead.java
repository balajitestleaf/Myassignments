package automationtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Createlead {

	public static void main(String[] args) 
	
	{

	    FirefoxDriver driver = new FirefoxDriver();			
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Balaji");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Giridharan");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("nttdata");
	    driver.findElement(By.name("createLeadForm_generalProfTitle")).sendKeys("Testlead");
	    driver.findElement(By.name("submitButton")).click();
	    
		
	    String title1 = driver.getTitle();	        
        System.out.println(title1);  
    
	    driver.close();
	
	}

}
