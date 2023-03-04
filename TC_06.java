package testNGproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC06 {
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
	 public void checkprice() throws InterruptedException {
		
		 driver.findElement(By.name("search")).sendKeys("Canon");
	        driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")).click();
	        driver.findElement(By.name("option[226]")).click();
	        driver.findElement(By.xpath("//*[@id=\"input-option226\"]/option[2]")).click();
	        driver.findElement(By.name("quantity")).clear();
	        driver.findElement(By.name("quantity")).sendKeys("2");
	        driver.findElement(By.xpath("//div[@id='product']/div[2]/button")).click();
	        Thread.sleep(7000);
	        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i")).click();
	        Thread.sleep(7000);
	        String price=driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[6]")).getText();
	        price = price.substring(1);
	        double i= Double.parseDouble(price);
	        if(i<200.00)
	        {
	        	driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/a")).click();
	        	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[1]/a/img")).click();
	        	driver.findElement(By.name("option[226]")).click();
	            driver.findElement(By.xpath("//*[@id=\"input-option226\"]/option[2]")).click();
	        	driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	        	 Thread.sleep(4000);
	            driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i")).click();
	        	 Thread.sleep(4000);
	        }
	        if(i>=200)
	        {
	        	driver.findElement(By.linkText("My Account")).click();
	   	        driver.findElement(By.linkText("Logout")).click();
	        }
	        else
	        {
	        	driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
	            driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/ul/li[5]/a")).click();
	            Thread.sleep(4000);
	            
	        	
	        }
	        }
	     @AfterMethod
		   	 public void teardown() {
		   		
		   	 driver.close();
		   	}
	 }
