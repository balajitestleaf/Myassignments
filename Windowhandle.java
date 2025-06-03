package automationtesting;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


	public class Windowhandle
	{

		public static void main(String[] args) throws InterruptedException
		
		{
			
			FirefoxDriver driver = new FirefoxDriver();		
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("username")).sendKeys("democsr");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Merge Contacts")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//div[@id='sectionHeaderTitle_contacts']/following::img)[1]")).click();

			
			Thread.sleep(3000);

			Set<String> allWindow = driver.getWindowHandles();
			System.out.println(allWindow);
            List<String> getWindow=new ArrayList<String>(allWindow);
			
			driver.switchTo().window(getWindow.get(1));
			driver.findElement(By.linkText("DemoCustomer")).click();
			driver.switchTo().window(getWindow.get(0));

			driver.findElement(By.xpath("(//div[@id='sectionHeaderTitle_contacts']/following::img)[2]")).click();

			Thread.sleep(3000);
			Set<String> allWindow1 = driver.getWindowHandles();
			System.out.println(allWindow1);
            List<String> getWindow1=new ArrayList<String>(allWindow1);
			
			driver.switchTo().window(getWindow1.get(1));
			driver.findElement(By.linkText("FrenchCustomer")).click();
			
			
			driver.switchTo().window(getWindow.get(0));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Merge']")).click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
			String last = driver.getTitle();
			System.out.println(last);
						
			
	

		
		
		
		
		}
		
	}
	
