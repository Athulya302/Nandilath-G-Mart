package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagelogin {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[2]/header/div/div[2]/div/div/div[3]/div[1]/a")
	WebElement act;
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(name="login")
	WebElement login;
	public Pagelogin(WebDriver driver) {
		 this.driver=driver;
			PageFactory.initElements(driver,this);
			}
		 	public void setvalues(String un,String pwd) {
			
				username.sendKeys(un);
				password.sendKeys(pwd);
			}
			public void actclick() {
				//driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/div/div/div[3]/div[1]/a")).click();
				act.click();
			}

          public void loginclick() {
          login.click();
 }
		
			
		}

		
	
	


