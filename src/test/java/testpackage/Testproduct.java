package testpackage;

import org.testng.annotations.Test;
import basepackage.Baseclass;
import pagepackage.Pagelogin;
import pagepackage.Productclass;
import utilpackage.Utilclass;

public class Testproduct extends Baseclass{
	@Test
	public void verifyLoginwithValidCred() throws InterruptedException {
		Pagelogin p1=new Pagelogin(driver);
		Productclass p=new Productclass(driver);
		//p1.actclick();
	
	//p1.setvalues("aryasree78@gmail.com","aryasree@1234");
	//	p1.loginclick();
				
				
		p.refclick();	
		p.singledrclick();
		p.prdctclick();
		p.addcartclick();
				
				
			}		
		
			}
	
		


