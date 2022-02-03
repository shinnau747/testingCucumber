package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Testing101Page {
	WebDriver driver;
	public Testing101Page(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	 WebElement BlueBackground;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement WhiteBackground  ;
	@FindBy(how = How.XPATH, using = "/html/body")
	WebElement Body;
	
	public boolean assertBlueButtonexists() {
		
	WebElement BG = BlueBackground;
	boolean value = BG.isSelected();
	return value;
	
	}
	
	public boolean assertWhiteButtonexists() throws Throwable {
		
		WebElement WG = WhiteBackground;
		boolean value= WG.isSelected();
		Thread.sleep(3000);

		return value;
		
		}
	

	public void clickOnBlueBG() {
		
		BlueBackground.click();
	}

	public void clickOnWhiteBG() {
		
		WhiteBackground.click();
	}

	public WebElement checkBGColor() {
		
		WebElement BGB = Body;
		return BGB;
	}
	

}
