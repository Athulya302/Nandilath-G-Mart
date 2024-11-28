package testpackage;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.Checkoutclass;
import pagepackage.Pagelogin;
import pagepackage.Productclass;

public class Checkouttest extends Baseclass {
	@Test
	public void verifyLoginwithValidCred() throws InterruptedException {
		Checkoutclass p2=new Checkoutclass(driver);
		Productclass p=new Productclass(driver);
		//Pagelogin p1=new Pagelogin(driver);
		//p1.actclick();
		//p1.setvalues("aryasree78@gmail.com","aryasree@1234");
		//p1.loginclick();
		
		p.refclick();	
		p.singledrclick();
		p.prdctclick();
		p.addcartclick();
	    p2.viewclick();
	    p2.checkclick();
		
		

}
}
