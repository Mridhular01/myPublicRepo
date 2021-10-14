package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class canvasPageObjects {
	
	WebDriver driver;
	
	By btnLine = By.xpath("//input[contains(@class,'button line')]");
	By btnRectangle = By.xpath("//input[@class='button rectangle']");
	By lblcanvas = By.id("imageTemp");
	By btnErase = By.xpath("//input[@class='button eraser']");
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chira\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.htmlcanvasstudio.com/");
	    driver.manage().window().maximize();
	}
	public void clickLine()
	{
		driver.findElement(btnLine).click();	
	}
	public void clickRectangle()
	{
		driver.findElement(btnRectangle).click();	
	}
	public void clickErase()
	{
		driver.findElement(btnErase).click();	
	}
	public void drawShapes(int x,int y,int x1, int y1) throws InterruptedException
	{
		 Actions action= new Actions(driver);
		 Thread.sleep(1000);
		 action.moveToElement(driver.findElement(lblcanvas),0,0);
		 action.moveToElement(driver.findElement(lblcanvas),x,y).clickAndHold().moveByOffset(x1,y1).click().release().perform();

	}
	public void tearDown()
	{
		driver.close();
	}

}
