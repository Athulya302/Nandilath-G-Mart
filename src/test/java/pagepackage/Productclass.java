package pagepackage;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Productclass {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"carousel-67359d780f7e5\"]/div/div[1]/div/div[1]/div/div/a")
	WebElement act;
	@FindBy(xpath="//a[@href=\"https://nandilathgmart.com/product-category/store/refrigerators/\"]/child::span[text()=\"Refrigerators\"]")
	WebElement refrigerator;
	@FindBy(xpath="//li[@id=\"menu-item-106699\"]/child::a")
	WebElement sdr;
	@FindBy(xpath="//a[text()=\"Haier 165 L 1 Star Direct Cool Single Door Refrigerator (HRD-1861BBR-N, Red Mono)\"]")
	WebElement product;
	@FindBy(name="add-to-cart")
	WebElement addtocart;
	
	public  Productclass(WebDriver driver) {
		 this.driver=driver;
			PageFactory.initElements(driver,this);
			}
	public void actclick(){
	 act.click();
	}
	public void refclick() {
		Actions act=new Actions(driver);
		act.moveToElement(refrigerator).perform();
	//	refrigerator.click();
		}
	public void singledrclick(){
		//Actions act1=new Actions(driver);
		//act1.moveToElement(sdr).perform();
		sdr.click();
		}
	public void prdctclick() throws InterruptedException {
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,300)","");
		//Actions act=new Actions(driver);
		//WebElement product=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/section[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/a"));
		  // act.moveToElement(product).click().perform();
		
		 //driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/section[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/a")).click();
		
		product.click();
		
	}
	public void addcartclick(){
		addtocart.click();
	}
}
	
		
	
	
      
    

