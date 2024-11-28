package testpackage;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.Pagelogin;
import utilpackage.Utilclass;

public class Testlogin extends Baseclass{
	@Test
	public void verifyLoginwithValidCred() throws InterruptedException {
		Pagelogin p1=new Pagelogin(driver);
		p1.actclick();  
		
		String xl="C:\\Users\\Lenovo\\Downloads\\nandilath g mart1.xlsx";
		String Sheet="Sheet1";
		int rowCount=Utilclass.getRowCount(xl,Sheet);
		System.out.println("rowCount:"+rowCount);
		
		for(int i=1;i<=rowCount;i++) {
			int cellcount=Utilclass.getCellCount(xl,Sheet,i);
			System.out.println("Cell count: "+cellcount);
			
			for(int j=0;j<cellcount;j+=2) {
				String username=Utilclass.getCellValue(xl,Sheet,i,j);
				System.out.println("username="+username);
				String pwd=Utilclass.getCellValue(xl,Sheet,i,j+1);
				System.out.println("password="+pwd);
			
				p1.setvalues(username,pwd);
				p1.loginclick();
			
				driver.get("https://nandilathgmart.com/");
				//driver.get("https://nandilathgmart.com/my-account/");
				p1.actclick();    
			}
		}
	}

}
