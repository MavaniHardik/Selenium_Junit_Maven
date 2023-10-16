package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
    ChromeDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test

    public void openTestWebsite() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("kartik.kk@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Kaka@123456");
        driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
    Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();
        Thread.sleep(4000);





    }

}
