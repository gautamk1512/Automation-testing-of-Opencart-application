package testNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03 {
	WebDriver driver;  
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://localhost/opencartsite/");
		 driver.findElement(By.linkText("My Account")).click();
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.name("email")).sendKeys("victor.rekala09@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("paul123");
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	}
	
	 @Test(priority=1)
	 public void addphone() throws InterruptedException {
		 
		 driver.findElement(By.linkText("Tablets")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[1]/a/img")).click();
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
	        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
       	    Thread.sleep(10000);
      
	        }
	        @Test(priority=2) 
	       public void checkout() throws InterruptedException {
	        
	        	 driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i")).click();
	             Thread.sleep(5000);
	             driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a/i")).click();
	             Thread.sleep(5000);
	             driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	      	        	
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a")).click();
	        driver.findElement(By.xpath("//*[@id=\"input-coupon\"]")).sendKeys("123456");
	        driver.findElement(By.xpath("//*[@id=\"button-coupon\"]")).click();
	        Thread.sleep(5000);
	        }
	 @Test(priority=3) 
	 public void logout() {
		 driver.findElement(By.linkText("My Account")).click();
	        driver.findElement(By.linkText("Logout")).click();
	 }
	 @AfterMethod
	 public void teardown() {
		
	 driver.close();
	}
}
