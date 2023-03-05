package Browser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {
	public static void main(String[] args) {
			
		System.out.println("Enter Browser Name");
		Scanner scan=new Scanner(System.in);
		String browser=scan.nextLine();
		WebDriver driver ;	
		switch(browser) {
		case "CHROME":
			driver = new ChromeDriver();
		case "FIREFOX":
			driver=new FirefoxDriver();
		case "EDGE":
			driver=new InternetExplorerDriver();
			break;
		default :
			driver=new ChromeDriver();
		}
		
	
	}
}
