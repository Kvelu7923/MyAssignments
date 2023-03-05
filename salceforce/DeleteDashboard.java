package salceforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DeleteDashboard extends Baseclss {
	
	@Test
	public void deleteDash() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='search-text-field slds-input input uiInput uiInputText uiInput--default uiInput--input']")).sendKeys("by Mr.Kathir");
		Thread.sleep(3000);

		WebElement delete = driver.findElement(By.xpath("//span[@class='slds-grid slds-align_absolute-center slds-grid_align-spread']"));
		Actions dd1=new Actions(driver);
		dd1.moveToElement(delete).perform();
		delete.click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Delete'])[2]")).click();
		
	}
	

}
