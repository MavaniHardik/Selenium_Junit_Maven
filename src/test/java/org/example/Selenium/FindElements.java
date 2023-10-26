package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class FindElements {
    WebDriver driver;
    String baseurl;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/"); // given
    }
//Find elements method
    @Test
    public void findElementsMethod() throws InterruptedException {
String mycurrentUrl= driver.getCurrentUrl();
String mypageTitle =driver.getTitle();

String pagesource = driver.getPageSource();
        System.out.println(mycurrentUrl);
        System.out.println(mypageTitle);
        System.out.println(pagesource);


    List<WebElement> listOfMenu= driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li"));
        System.out.println(listOfMenu.size());

        System.out.println("my list "+listOfMenu);

        for (WebElement myelement:listOfMenu) {
            String myText = myelement.getText();
            //print all value from list

            System.out.println(myText);
        }

        }



    @After
    public void tearDown() {
        driver.quit();}}


