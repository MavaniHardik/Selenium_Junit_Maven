package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

    ChromeDriver driver;

    @Before

    public void setUpChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    //Find BY ID Locator
    @Test
    public void openTestWebsite() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("/html/body/ytd-app/ytd-consent-bump-v2-lightbox/tp-yt-paper-dialog/div[4]/div[2]/div[6]/div[1]/ytd-button-renderer[1]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();//driver.findElement(By.id("search-form")).click();
        driver.findElement(By.id("search-input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Udja kale kava");
        driver.findElement(By.id("search-icon-legacy")).click();


      Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title=\"Udd Jaa Kaale Kaava | Gadar 2 | Sunny Deol, Ameesha | Mithoon, Udit N, Alka Y | Uttam S,Anand Bakshi\"]")).click();
     //driver.findElement(By.xpath("//a[@title=\"Dhuni Re Dhakhavi |  Sachin-Jigar| Sachin Sanghvi | Nishant Thacker\"]")).click();

        Thread.sleep(1000);

    }}

//    @After
//    public void closeTest() {
//        driver.close();
//    }
//}