package canvas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import pageObjects.canvasPageObjects;

public class NewTest {
	canvasPageObjects canvasPage= new canvasPageObjects();
	@BeforeMethod
	public void setupTest() {
		canvasPage.setup();
	    
	}
  @Test
  public void drawLine() throws InterruptedException {
	  canvasPage.clickLine();
	  canvasPage.drawShapes(-200,50, 100, 0);
	  canvasPage.clickLine();
	  canvasPage.drawShapes(-150,-25, 0, 150);
	  canvasPage.clickRectangle();
	  canvasPage.drawShapes(-200,150, 60, 40);
	  canvasPage.clickErase();
	  canvasPage.drawShapes(-200,50, 100, 0);
	  
  }
  @AfterMethod
  public void tearDownMethod()
  {
	  canvasPage.tearDown();  
  }
}

