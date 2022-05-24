package wwk5.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day2.parametrs;

public class ProjectSpecificMethod {
	public RemoteWebDriver driver;
	@Parameters({"URL","browserName"})
	@BeforeMethod
public void startBrowser(String url,String browserName) {
		if(browserName.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
		}else if(browserName.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
}
@AfterMethod
public void endBrowser() {
	driver.close();
}
}
