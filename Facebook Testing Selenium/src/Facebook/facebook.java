package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.firefox.driver","C:\\selenium webdriver\\FirefoxDriver\\geckodriver-v0.32.0-win-aarch64\\geckodrive.exe");
	        FirefoxDriver driver = new FirefoxDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#email")).sendKeys("shishir@gmail.com");
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Forgotten password?")).click();
	        Thread.sleep(2000);
	        driver.navigate().back();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Create a Page")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/div[2]/button[1]/div[1]/div[1]")).click();
	        Thread.sleep(1000);
	        driver.navigate().back();
	        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[2]/button[1]/div[1]/div[1]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]")).click(); 
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Shishir");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Khandakar");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("shishir@gmail");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("12as345");
	        Thread.sleep(2000);	       
	        driver.findElement(By.xpath("//select[@id='day']")).sendKeys("2");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jan");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2002");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[11]/button[1]")).click();
	      
	        
	        
	      
	        
	       
	             
	}

	}
