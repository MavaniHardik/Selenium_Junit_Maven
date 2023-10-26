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

import static org.junit.Assert.*;

public class Dropdown {
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
    public void dropDown() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("carselect"));

        Select selectDropDown = new Select(dropdown);
        selectDropDown.selectByIndex(2);
        Thread.sleep(2000);
        selectDropDown.selectByValue("honda");
        Thread.sleep(2000);




    }



    @After
    public void tearDown() {
        driver.close();
    }
}

