package testNGproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC04 {
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
	 public void addtocart() throws InterruptedException {
		
		 driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a/i")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[1]/a/img")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img")).click();
	        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	        Thread.sleep(5000);
	 }
	        @Test(priority=2)
	        public void updatequantity() throws InterruptedException {
	        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/input")).clear();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/input")).sendKeys("5");
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[1]/i")).click();
	        Thread.sleep(5000);
	        }
	        @Test(priority=3)
	        public void checkout() throws InterruptedException {
	        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.name("firstname")).sendKeys("Victor");
	        driver.findElement(By.name("lastname")).sendKeys("Paul");
	        driver.findElement(By.name("company")).sendKeys("Wipro");
	        driver.findElement(By.name("address_1")).sendKeys("Defence Colony");
	        driver.findElement(By.name("address_2")).sendKeys("RK nagar");
	        driver.findElement(By.name("city")).sendKeys("Hyderabad");
	        driver.findElement(By.name("postcode")).sendKeys("500047");
	        driver.findElement(By.name("country_id")).click();
	        driver.findElement(By.xpath("//*[@id=\"input-payment-country\"]/option[107]")).click();
	        driver.findElement(By.name("zone_id")).click();
	        driver.findElement(By.linkText("Maharashtra")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]")).click();
	        
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
	 
	 

