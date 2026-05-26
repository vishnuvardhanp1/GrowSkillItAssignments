/**
 * 
 */
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
/**
 * 
 */
public class DailyAssignment37_Selenium2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://files.wiseapp.live/upload_files/6932afb3c05630afe5a997f1/upload_865bf13a-30bc-4a6d-99de-198590146fd6.html");
	    Thread.sleep(2000);
	    
	    driver.manage().window().fullscreen();
	   
	    Thread.sleep(2000);
	    WebElement email=driver.findElement(By.xpath("//label[text()='First Name']/following-sibling::input[@id='email']"));
	    email.sendKeys("abc.com");
	    Thread.sleep(2000);
	    WebElement lname=driver.findElement(By.xpath("//label[text()='First Name']/following-sibling::input[@id='lname']"));
	    lname.sendKeys("pn");
	    Thread.sleep(2000);
	    WebElement div=driver.findElement(By.xpath("//button[text()='Login']/parent::div"));
	    WebElement div1=driver.findElement(By.xpath("//input[@id='username']/parent::div"));
	    
	    WebElement button1=driver.findElement(By.xpath("//button[contains(@id,'submitBtn')]"));
	    button1.click();
	    Thread.sleep(2000);
	    WebElement text=driver.findElement(By.xpath("//input[contains(@placeholder,'username')]"));
	    text.sendKeys("Vishnuvardhan");
	    Thread.sleep(2000);
	    WebElement link1=driver.findElement(By.xpath("//a[text()='Register Here']"));
	    link1.click();
	    Thread.sleep(2000);
	    WebElement link2=driver.findElement(By.xpath("//a[text()='Forgot Password']"));
	    link2.click();
	    Thread.sleep(2000);
	    WebElement user=driver.findElement(By.xpath("//input[starts-with(@id,'user')]"));
	    user.sendKeys("Vishnu");
	    Thread.sleep(2000);
	    WebElement admin=driver.findElement(By.xpath("//input[starts-with(@id,'admin')]"));
	    admin.sendKeys("Vishnu");
	    Thread.sleep(2000);
	    
	    WebElement email1=driver.findElement(By.xpath("//span[text()='Email Address']/following-sibling::input"));
	    
       email1.sendKeys("abc@gmail.com");
       Thread.sleep(2000);
       WebElement pwd=driver.findElement(By.xpath("//span[text()='Password']"));
       //pwd.sendKeys("*****");
       Thread.sleep(2000);
       
       

       WebElement div3=driver.findElement(By.xpath("//span[text()='Mobile Number']/parent::div"));
       Thread.sleep(2000);

	    driver.quit();
	    
	    

	    
	    
	    
	    
	    
	}

}
