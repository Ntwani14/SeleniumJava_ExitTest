package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import tests.BaseClass;

public class PropertiesFile {
	
	static String projPath = System.getProperty("user.dir");
	static Properties prop = new Properties();
	
	public static void main(String[] args) throws IOException {
		
		readPropertiesFile();
	}
	
	public static void readPropertiesFile() throws IOException
	{
		try {
			
			InputStream input = new FileInputStream(projPath+"/src/test/java/Config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			BaseClass.browserName = browser;
			System.out.println(BaseClass.browserName);
			
			String browserMode = prop.getProperty("browserMode");
			BaseClass.mode = browserMode;
			System.out.println(BaseClass.mode);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getUrl() throws IOException
	{
		InputStream input = new FileInputStream(projPath+"/src/test/java/Config/config.properties");
		prop.load(input);
		String url = prop.getProperty("url");
		System.out.println(url);
		
		return url;
	}
	
	public static String getEmail() throws IOException
	{
		InputStream input = new FileInputStream(projPath+"/src/test/java/Config/config.properties");
		prop.load(input);
		String email = prop.getProperty("email");
		
		return email;
	}
	
	public static String getPassword() throws IOException
	{
		InputStream input = new FileInputStream(projPath+"/src/test/java/Config/config.properties");
		prop.load(input);
		String password = prop.getProperty("password");
		
		return password;
	}
	
	public static String getInvalidPassword() throws IOException
	{
		InputStream input = new FileInputStream(projPath+"/src/test/java/Config/config.properties");
		prop.load(input);
		String invalidPassword = prop.getProperty("invalidPassword");
		
		return invalidPassword;
	}
	
	public static String getInvalidEmail() throws IOException
	{
		InputStream input = new FileInputStream(projPath+"/src/test/java/Config/config.properties");
		prop.load(input);
		String invalidEmail = prop.getProperty("invalidEmail");
		
		return invalidEmail;
	}
	
}
