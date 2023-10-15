package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLwithMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // chrome driver is predefined class by selenium
        WebDriver driver = new ChromeDriver();
        // ChromeDriver chromeDriver = new ChromeDriver();

        // interface           class
        driver.manage().window().maximize();// selenium code frame work
        driver.get("https://demo.nopcommerce.com/");
    }
}