package LIB;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keywords {
	
	WebDriver driver;
	
	public Keywords(WebDriver driver){
		this.driver=driver;
	}
	
	public void perform(Properties p, String action, String objectName, String objectType, String value){
		if(action.equals("CLICK")) 
			try {
				driver.findElement(this.getObject(p, objectName, objectType)).click();
			} catch (Exception e) {
				System.out.println(e);
			}
		
		else if(action.equals("ENTERDATA")) 
			try {
				driver.findElement(this.getObject(p, objectName, objectType)).sendKeys(value);
			} catch (Exception e) {
				System.out.println(e);
			}
		
		else if(action.equals("OPENAPPLICATION")) 
			try {
				driver.get(p.getProperty(value));
			} catch (Exception e) {
				System.out.println(e);
			}
		
		else if(action.equals("CLOSEAPPLICATION")) 
			try {
				driver.quit();
			} catch (Exception e) {
				System.out.println(e);
			}
		
		else if(action.equals("GETTEXT")) 
			try {
				driver.findElement(this.getObject(p, objectName, objectType)).getText();
			} catch (Exception e) {
				System.out.println(e);
			}
		
	
	}

	private By getObject(Properties p, String objectName, String objectType) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
