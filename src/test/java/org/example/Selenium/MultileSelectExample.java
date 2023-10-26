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

public class MultileSelectExample {
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
        WebElement multipleSelect = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(multipleSelect);

        select.selectByVisibleText("Apple");
        select.selectByVisibleText("Peach");
        Thread.sleep(2000);
        select.deselectByVisibleText("Peach");
        Thread.sleep(1000);
        select.selectByVisibleText("Orange");







    }



    @After
    public void tearDown() {
        driver.close();
    }
}
