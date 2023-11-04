package org.example.testFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetTextRegistrationpage {
    ChromeDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }
    //Find BY ID Locator
    @Test
    public void openTestWebsite() throws InterruptedException {
       List<WebElement> registraionText = driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]/div[2]/ul/li"));


       // System.out.println(registraionText.size());
        System.out.println("Registration page text"+ registraionText);
        for (WebElement myText:registraionText) {
            String myRegistrationpage=myText.getText();
            System.out.println(myRegistrationpage);


            List<WebElement> registraionText1= driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]/div[3]/ul/li"));
            for (WebElement myAccount:registraionText1) {
                String newAccount = myAccount.getText();
                System.out.println(newAccount);


            }

        }
        Thread.sleep(4000);

        }







    @After
    public void closeTest(){
        driver.close();
    }}



