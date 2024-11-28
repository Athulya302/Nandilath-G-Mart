package pagepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageclassregister {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[2]/header/div/div[2]/div/div/div[3]/div[1]/a")
  	WebElement act;
	 @FindBy(xpath="//a[text()='Create an Account']")
	 WebElement createacnt;
	 @FindBy(id="reg_username")
	 WebElement username;
	 @FindBy(id="reg_email")
	 WebElement email;
	 @FindBy(id="reg_password")
	 WebElement password;
	 @FindBy(xpath="//button[contains(text(),'Register')]")
	 WebElement register;
	 
	public Pageclassregister(WebDriver driver) {
		 this.driver=driver;
			PageFactory.initElements(driver,this);
			}
			public void setvalues(String un,String mail,String pwd) {
			
				username.sendKeys(un);
				email.sendKeys(mail);
				password.sendKeys(pwd);
			}
			public void actclick() {
				//driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/div/div/div[3]/div[1]/a")).click();
				act.click();
			}
				
				public void create_acntclick() {
					WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Create an Account']")));	
				createacnt.click();
				
			}
				public void register_click() {
				register.click();
				 }
	 } 
