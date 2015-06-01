package basics;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInvocation {

	public static WebDriver driver;
	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Choose browser: Chrome | IE | Firefox\n");
		System.out.println("Enter choice: ");
		String input = reader.next();

		if (input.toLowerCase().equals("chrome")) {
			// Chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kyle\\Documents\\selenium-2.45.0\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://agavelove.com");
		} else if (input.toLowerCase().equals("ie")) {
			// Internet Explorer driver
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Kyle\\Documents\\selenium-2.45.0\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("http://google.com");
		} else {
			// Use Interface WebDriver to open new Firefox window.
			driver = new FirefoxDriver();
			System.out.println("Firefox has been opened.");
			
			driver.get("http://domainindustries.com");
			testSearch();
			//driver.findElement(By.id("u2417"));
			//driver.findElement(By.name(""));
			
			// Basic WebDriver methods
			System.out.println(driver.getTitle());
			System.out.println(driver.getPageSource());
			System.out.println(driver.getCurrentUrl());
		}
		end();
		reader.close();
		
	}
	
	static void testSearch() {
		String sinks[] = {"omega"};
		for (int i = 0; i < sinks.length; i++) {
			driver.findElement(By.xpath("//*[@id='search']")).click();
			driver.findElement(By.xpath("//*[@id='search']")).sendKeys(sinks[i]);
			driver.findElement(By.xpath("html/body/div[8]/ul/li[6]")).click();
			driver.findElement(By.xpath("//*[@id='product_addtocart_form']/div[2]/div[1]/div[2]/div[2]/div[6]/a")).click();
			driver.findElement(By.xpath("//*[@id='email']")).click();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kyle@domainindustries.com");
			driver.findElement(By.xpath("//*[@id='pass']")).click();
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("ashdrum10");
			driver.findElement(By.xpath("//*[@id='send2']")).click();
			
			System.out.println("Logging In");
			System.out.println("");
			
		}
	}
	
	static void end() {
		System.out.println("Are you finished?");
		String input = reader.next();
		if (input.toLowerCase().equals("yes")) {
			driver.close();
			System.out.println("Thank you for using Kyle's Selenium driver!");
		} else {
			end();
		};
	}

}
