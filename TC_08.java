package testNGproject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC08 {
	WebDriver driver;  
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://localhost/opencartsite/");
	}
	@Test
	public void nooflinks() throws InterruptedException {
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.name("email")).sendKeys("victor.rekala09@gmail.com");
        driver.findElement(By.name("password")).sendKeys("paul123");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        List<WebElement> b = driver.findElements(By.tagName("a"));
        System.out.println(b.size());
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/ul/li[5]/a")).click();
        Thread.sleep(4000);
        }
	@AfterMethod
	 public void teardown() {
		 driver.close();
	 }
}