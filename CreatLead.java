package wwk5.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatLead extends ProjectSpecificMethod {
	@Test(dataProvider="testData")
	public void runCreatLead (String Username,String Password,String Cname,String Fname,String Lname) {
		
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider
	public String[][] testData ()	{
		String[][]array=new String[2][5];
		
   array[0][0]="DemoSalesManager";
   array[0][1]="crmsfa";
   array[0][2]="TestLeaf";
   array[0][3]="Hari";
   array[0][4]="R";
   array[1][0]="DemoCSR";
   array[1][1]="crmsfa";
   array[1][2]="TestLeaf";
   array[1][3]="Babu";
   array[1][4]="M";
   return array;
	}
}



