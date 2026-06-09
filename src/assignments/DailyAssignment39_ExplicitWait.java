/**
 * 
 */
package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 */
public class DailyAssignment39_ExplicitWait {

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
	    driver.get("https://files.wiseapp.live/upload_files/6932afb3c05630afe5a997f1/upload_e8b6df31-b24c-452b-9cf7-44ccd9eed91d.html");
	    Thread.sleep(2000);
	    
	   
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(14));

	 // Click Drink Category
	 wait.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("//button[@data-type='drink']"))).click();

	 // Add Drink
	 wait.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("//*[@id='drink1']/button"))).click();

	 // Confirm Order
	 wait.until(ExpectedConditions.elementToBeClickable(
	         By.id("confirmOrderBtn"))).click();

	 // Wait for popup and close it
	 wait.until(ExpectedConditions.visibilityOfElementLocated(
	         By.id("closePopupBtn")));

	 wait.until(ExpectedConditions.elementToBeClickable(
	         By.id("closePopupBtn"))).click();

	 // Click Dessert Category
	 wait.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("//button[@data-type='dessert']"))).click();

	 // Add Dessert
	 wait.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("//*[@id='dessert2']/button"))).click();

	 // Click Soup Category
	 wait.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("//button[@data-type='soup']"))).click();

	 // Add Soup
	 wait.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("//*[@id='soup2']/button"))).click();

	 // Confirm Order
	 wait.until(ExpectedConditions.elementToBeClickable(
	         By.id("confirmOrderBtn"))).click();

	 // Wait for popup and close it
	 wait.until(ExpectedConditions.visibilityOfElementLocated(
	         By.id("closePopupBtn")));

	 wait.until(ExpectedConditions.elementToBeClickable(
	         By.id("closePopupBtn"))).click();

	 // Open Cart
	 wait.until(ExpectedConditions.elementToBeClickable(
	         By.id("cartBtn"))).click();
	}

}
