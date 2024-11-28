package testpackage;

import org.testng.annotations.Test;
import basepackage.Baseclass;
import pagepackage.Pageclassregister;
import utilpackage.Utilclass;

public class Testregister extends Baseclass{
	@Test
	public void verifyLoginwithValidCred() throws InterruptedException {
		Pageclassregister p1=new Pageclassregister(driver);
		p1.actclick();  
		p1.create_acntclick();
		String xl="C:\\Users\\Lenovo\\Desktop\\automation\\Automationprjctreglo.xlsx";
		String Sheet="Sheet1";
		int rowCount=Utilclass.getRowCount(xl,Sheet);
		System.out.println(rowCount);  
		
		for(int i=1;i<=rowCount;i++) {
			int cellcount=Utilclass.getCellCount(xl,Sheet,i);
			System.out.println("Cell count: "+cellcount);
			
			for(int j=0;j<cellcount;j+=2) {
				String username=Utilclass.getCellValue(xl,Sheet,i,j);
				System.out.println("username="+username);
				String email=Utilclass.getCellValue(xl,Sheet,i,j+1);
				System.out.println("email="+email);
				String pwd=Utilclass.getCellValue(xl,Sheet,i,j+2);
				System.out.println("password="+pwd);
				
				p1.setvalues(username,email,pwd);
				
			    
			
				p1.register_click();
			}
						
				Thread.sleep(1000);
				driver.get("https://nandilathgmart.com/"); 
			}
		}

	}


