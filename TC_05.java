package testNGproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC05 {
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
	 public void giftvoucher() throws InterruptedException {
		
		 driver.findElement(By.linkText("Gift Certificates")).click();
	        driver.findElement(By.name("to_name")).sendKeys("Sujeeth");
	        driver.findElement(By.name("to_email")).sendKeys("sujeeth123@gmail.com");
	        driver.findElement(By.name("from_name")).clear();
	        driver.findElement(By.name("from_name")).sendKeys("Victor Paul");
	        driver.findElement(By.name("from_email")).clear();
	        driver.findElement(By.name("from_email")).sendKeys("victor.rekala09@gmail.com");
	        driver.findElement(By.name("voucher_theme_id")).click();
	        driver.findElement(By.name("message")).sendKeys("Happy Birthday Sujeeth...");
	        driver.findElement(By.name("amount")).clear();
	        driver.findElement(By.name("amount")).sendKeys("100");
	        driver.findElement(By.name("agree")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[8]/div/input[2]")).click();
	        
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button/i")).click();
	        Thread.sleep(5000);
	        
	        boolean a=  driver.findElement(By.xpath("//*[@id=\"checkout-cart\"]/div[1]")).isDisplayed();
	        Assert.assertTrue(a);
	        Assert.assertEquals(a,true);
	        
	       // driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]")).click();
	       // Thread.sleep(5000);
	       // driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[2]/td[4]/div/span/button[2]/i")).click();
	        //Thread.sleep(5000);
	       // driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[3]/td[4]/div/span/button[2]/i")).click();
	       // Thread.sleep(5000);
	    
	 }
	       @Test(priority=2)
	  	 public void customerservice() throws InterruptedException {
	        driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
	        driver.findElement(By.name("name")).clear();
	        driver.findElement(By.name("name")).sendKeys("Victor");
	        driver.findElement(By.name("email")).clear();
	        driver.findElement(By.name("email")).sendKeys("victor.rekala09@gmail.com");
	        driver.findElement(By.name("enquiry")).sendKeys("Hi \"Open cart\". This is 'Victor Paul'. My current registered address of my account is Hyderabad, So I would like to change my address to Bangalore. And also, my registered phone number is '6304315101', so I would also like to change my phone number to '9676461080'. So I kindly request you to look into my enquiry and update my respective details. Thank you.");
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	        Thread.sleep(5000);
	        String title=driver.getTitle();
	        
            Assert.assertEquals(title,"Your Store","title not matched");
	       }
	        @Test(priority=3)
		  	 public void accountupdate() throws InterruptedException {
	        driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[3]/a")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[2]")).click();
	        driver.findElement(By.name("telephone")).clear();
	        driver.findElement(By.name("telephone")).sendKeys("9676461087");
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[4]/a")).click();
	        driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]/a")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.name("firstname")).clear();
	        driver.findElement(By.name("firstname")).sendKeys("Victor");
	        driver.findElement(By.name("lastname")).clear();
	        driver.findElement(By.name("lastname")).sendKeys("Paul");
	        driver.findElement(By.name("email")).clear();
	        driver.findElement(By.name("email")).sendKeys("victor.rekala09@gmail.com");
	        driver.findElement(By.name("telephone")).clear();
	        driver.findElement(By.name("telephone")).sendKeys("9676461087");
	        driver.findElement(By.name("order_id")).sendKeys("1234");
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[1]/div[6]/div/div/span/button/i")).click();
	        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/table/tbody/tr[5]/td[4]")).click();
	        driver.findElement(By.name("product")).sendKeys("MacBook");
	        driver.findElement(By.name("model")).sendKeys("Product 16");
	        driver.findElement(By.name("return_reason_id")).click();
	        driver.findElement(By.name("comment")).sendKeys("I have got different product.");
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.linkText("My Account")).click();
	        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	        
	        driver.findElement(By.linkText("Modify your address book entries")).click();
	        driver.findElement(By.linkText("New Address")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.name("firstname")).sendKeys("Victor");
	        driver.findElement(By.name("lastname")).sendKeys("Paul");
	        driver.findElement(By.name("company")).sendKeys("Wipro");
	        driver.findElement(By.name("address_1")).sendKeys("Defence Colony");
	        driver.findElement(By.name("address_2")).sendKeys("R.K.Nagar");
	        driver.findElement(By.name("city")).sendKeys("Hyderabad");
	        driver.findElement(By.name("postcode")).sendKeys("500047");
	        Thread.sleep(10000);
	        driver.findElement(By.name("country_id")).click();
	        driver.findElement(By.xpath("//*[@id=\"input-country\"]/option[107]")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
	        Thread.sleep(10000);
	        boolean b=driver.findElement(By.linkText("Success")).isDisplayed();
	        Assert.assertTrue(b);
	        Assert.assertEquals(b, true);
	 }
	        @Test(priority=4) 
		   	 public void logout() {
		   		 driver.findElement(By.linkText("My Account")).click();
		   	        driver.findElement(By.linkText("Logout")).click();
		   	     boolean c=  driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed();
			        Assert.assertTrue(c);
			        Assert.assertEquals(c,true);
		   	 }
 	 @AfterMethod
		    public void teardown() {
		   		
		   	 driver.close();
		   	}
	        }