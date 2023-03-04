package testNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02 {
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
		 public void productcamp() {
		
		 driver.findElement(By.name("search")).sendKeys("samsung");
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.name("category_id")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.name("sub_category")).click();
		 driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
		 driver.findElement(By.linkText("Phones & PDAs")).click();
		 driver.findElement(By.xpath("//*[@id=\"input-sort\"]")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[3]/i")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[3]/i")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[3]/i")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 driver.findElement(By.xpath("//*[@id=\"compare-total\"]")).click();
		 driver.findElement(By.linkText("HTC Touch HD")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 @Test(priority=2)
		 public void checkout() throws InterruptedException {
		 driver.findElement(By.linkText("Shopping Cart")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.linkText("Checkout")).click();
		
		 driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]")).click();
		 
		 }
		 @Test(priority=3)
		 public void orderhostoryt() throws InterruptedException {
		 driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[2]/a")).click();
		  driver.findElement(By.linkText("Continue")).click();
		 driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter")).click();
		 driver.findElement(By.linkText("Specials")).click();
		 Thread.sleep(15000);
		 driver.findElement(By.xpath("//*[@id=\"grid-view\"]/i")).click();
		 }
		 @Test(priority=4) 
	   	 public void logout() {
	   		 driver.findElement(By.linkText("My Account")).click();
	   	        driver.findElement(By.linkText("Logout")).click();
	   	 }
	    @AfterMethod
	   	 public void teardown() {
	   		
	   	 driver.close();
	   	} 
		 
		 
		 
		 
		 
		  
		 	 
}
