package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class CheckBox {

    WebDriver driver;
    String baseurl;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice"); // given
    }

    @Test
    public void checkBoxTest() throws InterruptedException {
        driver.findElement(By.id("bmwcheck")).click();  // when
        Boolean isBMWSelected = driver.findElement(By.id("bmwcheck")).isSelected(); //and
        System.out.println(isBMWSelected);
        assertTrue(isBMWSelected); //then
        Thread.sleep(2000);
        driver.findElement(By.id("benzcheck")).click();
        Boolean isBENZSelected =driver.findElement(By.id("benzcheck")).isSelected();
        System.out.println(isBENZSelected);
        assertTrue(isBENZSelected);
        Thread.sleep(2000);


    }

    @After
    public void tearDown() {
        driver.close();
    }
}
