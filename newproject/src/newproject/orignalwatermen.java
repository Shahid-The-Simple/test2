package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

//import firsttest.orignalwatermen;

public class orignalwatermen {

	ChromeDriver driver;
public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shahid\\eclipse-workspace\\libss\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.originalwatermen.com/");
		//driver.manage().timeouts().getImplicitWaitTimeout();
		
		
	}
public void search() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Trunks");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button")).click();
	Thread.sleep(5000);
	
}

public void nxtPage() throws InterruptedException {
	
	driver.navigate().to("https://www.originalwatermen.com/catalogsearch/result/?q=trunks");
	JavascriptExecutor Scrool = (JavascriptExecutor) driver;
	Scrool.executeScript("window.scrollBy(0,300)", "");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[11]/div/div[1]/a/img")).click();
	Thread.sleep(5000);
	
}

public void addTocart() throws InterruptedException {
	driver.navigate().to("https://www.originalwatermen.com/performance-stretch-rescue-trunk-w-guard/");
	JavascriptExecutor Scrool = (JavascriptExecutor) driver;
	Scrool.executeScript("window.scrollBy(0,300)", "");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"option-label-c2c_color-193-item-409\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"option-label-c2c_color-193-item-409\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"option-label-c2c_size-195-item-458\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
	Thread.sleep(5000);
}

public void closeBrowser() {
	driver.close();
}


public static void main(String[] args) throws InterruptedException {
   orignalwatermen og = new orignalwatermen();
   og.invokeBrowser();
   og.search();
   og.nxtPage();
   og.addTocart();
   og.closeBrowser();
   System.out.println("TEST PASS");
}
}

