package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi_Browser {
    static String browser = "edge";
    static String baseURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {
        //set up for chrome browser
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("webdriver.chrome.driver\",\"drivers/chromedriver.exe");
            driver =  new ChromeDriver();
        }
        //set up for firefox browser
        else if (browser.equalsIgnoreCase("firefox")){
            System.out.println("webdriver.firefox.driver\", \"drivers/geckodriver.exe" );
            driver = new FirefoxDriver();
        }
        //set up for edge browser
        else if (browser.equalsIgnoreCase("edge")){
            System.out.println("webdriver.edge.driver\", \"drivers/msedgedriver.exe" );
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Print the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //Enter the email to email field
        driver.findElement(By.id("Email"));
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("test123@gmail.com");

        //Enter the password to password field
        driver.findElement(By.id("Password"));
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("test123");

        //close the driver
        driver.quit();
    }
}