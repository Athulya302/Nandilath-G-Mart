package pagepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentclass {
	WebDriver driver;
	@FindBy(name="billing_first_name")
	WebElement fstname;
	@FindBy(name="billing_last_name")
	WebElement lstname;
	@FindBy(name="billing_address_1")
	WebElement adrs;
	@FindBy(name="billing_address_2")
	WebElement adrs2;
    @FindBy(name="billing_city")
	WebElement city ;
    @FindBy(xpath="//*[@id=\"billing_state_field\"]/span/span/span[1]/span")
   	WebElement state;
    @FindBy(name="billing_postcode")
   	WebElement pincode ;
    @FindBy(name="billing_phone")
   	WebElement phn;
    @FindBy(name="billing_email")
   	WebElement em;
  // @FindBy(id="payment_method_cod")
  // WebElement cd;
   @FindBy(name="terms")
  	WebElement cb;
   @FindBy(id="place_order")
  	WebElement plcodr;
    
    
    public Paymentclass(WebDriver driver) {
		 this.driver=driver;
			PageFactory.initElements(driver,this);
			}
    public void setvalues(String fn,String ln,String ads,String ads2,String cty,String pc,String pn,String el) {
		
		fstname.sendKeys(fn);
		lstname.sendKeys(ln);
		adrs.sendKeys(ads);
		adrs2.sendKeys(ads2);
		city.sendKeys(cty);
		pincode.sendKeys(pc);
		phn.sendKeys(pn);
		em.sendKeys(el);
	}
    /*public void cdclick() throws InterruptedException {
    	JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,2000)","");
		Thread.sleep(2000); 
    	//cd.click();
    }*/
    public void checkbox() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,4000)","");
		Thread.sleep(2000);       
		cb.click();
    
    } 
   
    
    
    public void placeorder() {
        plcodr.click();
} 
  
}




