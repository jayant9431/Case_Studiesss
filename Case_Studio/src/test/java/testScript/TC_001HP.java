package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
//import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObject.HomePage;
import testBase.BaseClass;

public class TC_001HP extends BaseClass {
	
	@Test
	public void multiTask() throws EncryptedDocumentException, IOException, InterruptedException {
		
		HomePage hp=new HomePage(driver);
		Thread.sleep(2000);
		
		hp.service();
		Thread.sleep(2000);
		
		hp.mobApp();
		Thread.sleep(2000);
		
		hp.service();
		Thread.sleep(2000);
		
		hp.studies();	
		Thread.sleep(2000);
		
		String ID = getExcelData("Data",1,0);
		Thread.sleep(2000);
		
		hp.mail(ID);
		Thread.sleep(2000);
		
		Reporter.log("Email ID  saved in Excel is: "+hp.mail2(),true);
		
		
	}

}
