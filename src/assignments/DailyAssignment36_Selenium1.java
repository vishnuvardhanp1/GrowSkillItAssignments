/**
 * 
 */
package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * task:
1) input in both text area "Hi all"
2) select dropdown green then blue then red
3) check the box
 */
public class DailyAssignment36_Selenium1 {

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
	    driver.get("https://files.wiseapp.live/upload_files/6932afb3c05630afe5a997f1/upload_23977dbb-fe87-4534-b42a-a7c8c07c7147.html");
	    Thread.sleep(2000);
	    
	    driver.manage().window().fullscreen();
	   
	    Thread.sleep(2000);
	    List<WebElement> textControls=driver.findElements(By.tagName("textarea"));
	    for(WebElement text:textControls) {
	    	text.sendKeys("Hi All");
	    	Thread.sleep(2000);
	    }
	    Thread.sleep(2000);
	    WebElement dropDownTag=driver.findElement(By.id("color"));
	    Select dropDown=new Select(dropDownTag);
	    dropDown.selectByContainsVisibleText("Green");
	    Thread.sleep(2000);
	    dropDown.selectByVisibleText("Blue");
	    Thread.sleep(2000);
	    dropDown.selectByIndex(0);
	    Thread.sleep(2000);
	    dropDown.selectByValue("1");
	    Thread.sleep(2000);
	    WebElement checkbox=driver.findElement(By.name("agreement"));
	    checkbox.click();
	    Thread.sleep(2000);
	   driver.quit();
	}

}
