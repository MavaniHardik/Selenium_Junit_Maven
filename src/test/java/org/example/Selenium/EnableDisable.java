package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class EnableDisable {
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
public void EnableTest() throws InterruptedException {
    driver.findElement(By.id("enabled-button")).click();
    Boolean isTextInputBoxenablenable = driver.findElement(By.id("enabled-example-input")).isEnabled();
    driver.findElement(By.id("enabled-example-input")).sendKeys("My name Hardik");
    System.out.println(isTextInputBoxenablenable);
    assertTrue(isTextInputBoxenablenable);

    Thread.sleep(2000);

    String myActualURL= driver.getCurrentUrl();
    System.out.println(myActualURL);
    System.out.println(baseurl);
    assertEquals(baseurl,myActualURL);   //This method is compare the URL

}
    @Test
    public void disableTest() throws InterruptedException {
        driver.findElement(By.id("disabled-button")).click();
      Boolean isTextInputBoxDisable =  driver.findElement(By.id("enabled-example-input")).isEnabled();
        System.out.println(isTextInputBoxDisable);
        assertFalse(isTextInputBoxDisable);

        Thread.sleep(2000);


    }

    @After
    public void tearDown() {
        driver.close();
    }
}
