package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seletrain;
	
	@FindBy(id="mycart")
	private WebElement card;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement face;
	
   public WebElement getFace() {
		return face;
	}

public Testing(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }

public WebElement getCard() {
	return card;
}


public WebElement getSeletrain() {
	return seletrain;
}

public void facebook()
{
	face.click();
	}


  
}
