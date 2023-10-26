package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    ChromeDriver driver;

    @Before
    public void setUpChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    //Find BY ID Locator
    @Test
    public void openTestWebsite() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("kartik.kk@gmail.com");
       driver.findElement(By.id("Password")).sendKeys("Kaka@123456");
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();



        Thread.sleep(4000);


    }
    @After
    public void closeTest(){
        driver.close();
    }}

