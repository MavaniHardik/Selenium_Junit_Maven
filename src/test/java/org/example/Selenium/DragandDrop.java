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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
    WebDriver driver;
    String baseurl="https://demo.automationtesting.in/Static.html";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
    }
    @Test
    public void mouseHoverTest() throws InterruptedException {

        driver.findElement(By.className("fc-button fc-cta-do-not-consent fc-secondary-button")).click();

        WebElement source = driver.findElement(By.id("/html/body/div[1]/ul/li[1]/img"));

        WebElement target = driver.findElement(By.id("trash"));

        Actions actions = new Actions(driver);

        Action action = actions.dragAndDrop(source,target).build();
        action.perform();

        Thread.sleep(3000);







    }



    @After
    public void tearDown() {
        driver.close();
    }
}


