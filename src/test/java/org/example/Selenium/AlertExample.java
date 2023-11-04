package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertExample {
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
    public void alertTest() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("Hardik Mavani");

        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();
        Thread.sleep(2000);
//confirmaton
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        //dismiss
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();





    }



    @After
    public void tearDown() {
        driver.close();
    }
}


