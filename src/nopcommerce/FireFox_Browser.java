package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Browser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //Set up FireFox browser
        System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        //Open URL
        driver.get(baseUrl);

        //Implicit
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Print the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

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

        //Close the browser
        driver.quit();
    }
}
