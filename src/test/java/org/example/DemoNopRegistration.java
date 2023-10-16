package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNopRegistration {
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
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.name("Gender")).click();
        driver.findElement(By.id("FirstName")).sendKeys("katik");
        driver.findElement(By.id("LastName")).sendKeys("kk");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[5]/input")).sendKeys("kartik.kk@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Kaka company ");
        driver.findElement(By.id("Password")).sendKeys("Kaka@123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Kaka@123456");
        driver.findElement(By.id("register-button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")).click();


                Thread.sleep(4000);


    }
    @After
   public void closeTest(){
        driver.close();
    }}



