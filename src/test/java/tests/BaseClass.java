package tests;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test(groups = "BaseClss")
public class BaseClass{
	
	static WebDriver driver = null;
	protected static org.apache.logging.log4j.Logger log = LogManager.getLogger();
	
	public static String browserName=null;
	public static String mode=null;
	
	
	ExtentSparkReporter sparkReporter;
	static ExtentReports extent;
	
	@BeforeSuite
	public void reportSetup()
	{
		sparkReporter = new ExtentSparkReporter("extentReports_Result/extent.html");
	    
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
		
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Extent Reports");
       
	}
	
	@BeforeClass
	public void Setup() throws IOException{
	
		String projectPath = System.getProperty("user.dir");//user.dir gives the location for your project wherever it is on the system
		
		ChromeOptions options = new ChromeOptions();
		FirefoxOptions option1 = new FirefoxOptions();
		
		PropertiesFile.readPropertiesFile();
		
	    if(mode.equalsIgnoreCase("non-headless"))
	    {
	        if(browserName.equalsIgnoreCase("chrome"))
	        {
	        	WebDriverManager.chromedriver().setup();
	    		driver = new ChromeDriver();
	        }
	        else if(browserName=="firefox")
	        {
	        	System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckodriver/geckodriver.exe");
	    		driver  = new FirefoxDriver();
	        }
	        else if(browserName=="IE")
	        {
	        	System.setProperty("webdriver.ie.driver", projectPath+"/drivers/IEdriver/IEDriverServer.exe");
	    		driver = new InternetExplorerDriver();

	        }
	        else
	        {
	        	System.out.println("The browser value is invalid");
	        }
	    }

	    else if(mode.equalsIgnoreCase("headless"))
	    {
	        if(browserName.equalsIgnoreCase("chrome"))
	        {
	        	options.setHeadless(true);
	    		options.addArguments("Window-size=1366,768");
	        	WebDriverManager.chromedriver().setup();
	    		driver = new ChromeDriver(options);
	        }
	        else if(browserName.equalsIgnoreCase("firefox"))
	        {
	        	System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckodriver/geckodriver.exe");
	            option1.setHeadless(true);
	    		option1.addArguments("Window-size=1366,768");
	    		driver = new FirefoxDriver(option1);
	        }
	        else if(browserName=="IE")
	        {
	        	System.setProperty("webdriver.ie.driver", projectPath+"/drivers/IEdriver/IEDriverServer.exe");
	    		driver = new InternetExplorerDriver();
	        }
	        
	        else
	        {
	        	System.out.println("The browser value is invalid");
	        }
	    }
	    
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    
	    //Opens URL
		driver.get(PropertiesFile.getUrl());
	}
	
//	public void baseTestLogin() throws IOException
//	{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		
//		driver.findElement(By.partialLinkText("Hello, sign in")).click();
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(PropertiesFile.getEmail());
//		driver.findElement(By.id("continue")).click();
//		
//		driver.findElement(By.id("ap_password")).sendKeys(PropertiesFile.getPassword());
//		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
//	}
	
	@AfterClass
	public void tearDown()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.close();
		driver.quit();
	}
	
	@AfterSuite
	public void reportTearDown()
	{
		extent.flush();
	}

}

