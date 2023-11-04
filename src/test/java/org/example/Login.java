package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    ChromeDriver driver;

    @Before
    public void setUpChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    //Find BY ID,xpath,calss Locator
    @Test
    public void openTestWebsite() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-login")).click();

        WebElement email=driver.findElement(By.id("Email"));

        email.sendKeys("kartik.kk@gmail.com");


       driver.findElement(By.id("Password")).sendKeys("Kaka@123456");
       driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).submit();
       Thread.sleep(2000);

       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")).click();
Thread.sleep(2000);
        driver.findElement(By.className("ico-logout")).click();


    }
    @After
    public void closeTest(){
        driver.close();
    }}

