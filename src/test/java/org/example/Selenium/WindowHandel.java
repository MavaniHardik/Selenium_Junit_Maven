package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandel {
    WebDriver driver;
    String baseurl="https://www.letskodeit.com/practice";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void switchToIframe() throws InterruptedException {
        System.out.println("Main browser : ");
        System.out.println(driver.getWindowHandle());
        String mainWindowsHandle = driver.getWindowHandle();
        driver.findElement(By.id("openwindow")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(mainWindowsHandle)) {
                driver.switchTo().window(windowHandle);
            }
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[1]/a")).click();
            Thread.sleep(3000);

        }
    }



        @After
        public void tearDown() {
                driver.quit();
            }}