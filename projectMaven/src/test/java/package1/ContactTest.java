package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		System.out.println("Execute Create Contact Test");
		String browser = System.getProperty("browser");
		WebDriver driver ;
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		String un = System.getProperty("username");
		String pwd = System.getProperty("password");
		String url = System.getProperty("url");
		System.out.println(browser);
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(url);
		
	}
	@Test
	public void modifyContactTest() {
		System.out.println("Execute modify Contact Test");
	}

}
