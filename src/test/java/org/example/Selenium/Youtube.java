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
//Not Play the song after below X path
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@aria-label=\"Udja Kale Kawan | Gadar | Sunny Deol & Ameesha Patel | Alka Yagnik & Udit Narayan | Lyrical by Vaani vaani 2,861,960 views 4 months ago 7 minutes, 33 seconds\"]")).click();
    }

    @After
    public void closeTest() {
        driver.close();
    }
}