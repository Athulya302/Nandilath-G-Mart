package pagepackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutclass {
	WebDriver driver;
	
	//@FindBy(xpath="/html/body/div[2]/header/div/div[2]/div/div/div[3]/div[4]/a")
	 //WebElement carticon;
	@FindBy(xpath="//a[contains(@class,'button btn-cart wc-forward') and text()='View cart']")
    WebElement viewcart;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div/section[2]/div/div[2]/div/section/div/div/div/div[2]/div/div/div/div/a")
    WebElement checkout;
	
	
	public  Checkoutclass(WebDriver driver) {
		 this.driver=driver;
			PageFactory.initElements(driver,this);
			}
		
		public void viewclick() throws InterruptedException {
		//	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/p[2]/a[1]")).click();
			Thread.sleep(1000);
			viewcart.click();
			Thread.sleep(1000);
		}
		public void checkclick() {
		checkout.click();
		
}

}  