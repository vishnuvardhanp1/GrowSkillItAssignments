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
public class DailyAssignment38_SeleniumTables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    try {
	    	WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
		
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://files.wiseapp.live/upload_files/6932afb3c05630afe5a997f1/upload_6bc7cf1f-3917-458b-9222-5d3b9f2cb3bc.html");
	    Thread.sleep(2000);
	    
	    driver.manage().window().fullscreen();
	   
	    Thread.sleep(2000);
	    for(int i=1; i<=4; i++)
	    {
	        int jan = Integer.parseInt(
	                driver.findElement(By.xpath("//input[@id='total"+i+"']/../../td[2]"))
	                .getText());

	        int feb = Integer.parseInt(
	                driver.findElement(By.xpath("//input[@id='total"+i+"']/../../td[3]"))
	                .getText());

	        int mar = Integer.parseInt(
	                driver.findElement(By.xpath("//input[@id='total"+i+"']/../../td[4]"))
	                .getText());

	        int apr = Integer.parseInt(
	                driver.findElement(By.xpath("//input[@id='total"+i+"']/../../td[5]"))
	                .getText());

	        int total = jan + feb + mar + apr;

	        driver.findElement(By.id("total"+i))
	              .sendKeys(String.valueOf(total));

	        System.out.println("Total = " + total);
	    }
	    driver.findElement(By.id("validateBtn")).click();
	    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
