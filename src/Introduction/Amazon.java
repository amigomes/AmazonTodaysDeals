package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ami\\Training\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
		//*[text() = 'hello']
		driver.findElements(By.xpath("//*[contains(text(),'Today')]")).get(0).click();
		Thread.sleep(5000L);
	    //driver.findElement(By.xpath("//*[@id='widgetFilters']/div/div[3]/div[1]/span/a/div/div[2]")).click();
		//*[@id="widgetFilters"]/div/div[3]/div[5]/span/a/div/div[1]/div
		driver.findElement(By.xpath("//*[@id='widgetFilters']/div/div[3]/div[5]/span/a/div/div[2]/span")).click();
		Thread.sleep(5000L);
		//WebElement parentElement = driver.findElement(By.xpath("//*[@id='widgetContent']"));
		
		//List<WebElement> childs = parentElement.findElements(By.xpath("./child::*"));
		
		List<WebElement> childs = driver.findElements(By.xpath("//*[@id='widgetContent']/child::*"));
		
		
		int count_of_childs=childs.size(); //find the number of elements in the child list
		
		for(int i=0;i<count_of_childs;i++)
		{
			// //*[@id="dealTitle"]/span
			//String text = childs.get(i).findElement(By.id("dealTitle")).getAttribute("class");
			String text = childs.get(i).findElement(By.xpath(".//a[@id='dealTitle']/span")).getText();
			System.out.println("Product " + Integer.toString(i) + " " + text);
			 
		}
	
	}

}

