package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class IsDisplayed {
    WebDriver driver;
    String baseurl="https://www.letskodeit.com/practice";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
    }
    @Test
    public void isDisplayedTest() throws InterruptedException {
        driver.findElement(By.id("show-textbox")).click();
        Boolean isDisplyed = driver.findElement(By.id("displayed-text")).isDisplayed();
        System.out.println(isDisplyed);
        assertTrue(isDisplyed);
        driver.findElement(By.id("displayed-text")).sendKeys("This is Paractice");
        Thread.sleep(2000);


    }
    @Test
    public void isNotisplayedTest() throws InterruptedException {
        driver.findElement(By.id("hide-textbox")).click();
        Boolean isNotisplayed = driver.findElement(By.id("displayed-text")).isDisplayed();
        System.out.println(isNotisplayed);
        assertFalse(isNotisplayed);

        Thread.sleep(2000);
    }

    @After
    public void tearDown() {
        driver.close();
    }
}

