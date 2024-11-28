package testpackage;


import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.Checkoutclass;
import pagepackage.Pagelogin;
import pagepackage.Paymentclass;
import pagepackage.Productclass;

public class Paymenttest extends Baseclass {
	@Test
	public void verifyLoginwithValidCred() throws InterruptedException {
		Paymentclass p3=new Paymentclass(driver);
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
		
	    p3.setvalues("Arya","sree","Gandhi Nagar nedoor","kochi","kochi","670702","7896789567","arayasree78@gmail.com");
	    //p3.cdclick();
	    p3.checkbox();
	    p3.placeorder();
	    
		/*
		 * p3.myacclick(); p1.setvalues("aryasree78@gmail.com","aryasree@1234");
		 * p1.loginclick(); p3.logoutclick();
		 */
	
	}
	
	

}
