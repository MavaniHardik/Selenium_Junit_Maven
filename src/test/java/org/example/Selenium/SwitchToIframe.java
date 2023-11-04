package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchToIframe {
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
    public void switchToIframe() throws InterruptedException {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");
        driver.switchTo().frame(0);
        driver.findElement(By.id("search")).click();
//        driver.findElement(By.id("search")).sendKeys("Python");
        Thread.sleep(3000);
////        //driver.findElement(By.className("form-control find-input dynamic-text")).sendKeys("Python");
////        Thread.sleep(2000);
//    //    driver.findElement(By.cssSelector(".find-course search-course")).click();



//        WebElement iframe = driver.findElement(By.id("iframe-example-div"));
//        driver.switchTo().frame(0);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/form/div/input")).sendKeys("python");
//        driver.findElement(By.className("find-course search-course")).click();
////        Thread.sleep(3000);







    }



    @After
    public void tearDown() {
        driver.close();
    }
}



