package test;

import nl.shriniketan.Base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;


public class SeleniumWebtest {



    @Test
    public void GoogleSearchValidity() {
        WebDriver d = DriverManager.InitFireFoxDriver();
        d.get("https://www.google.co.in");
        String title = d.getTitle();
        System.out.println(title);
        assertEquals("Google", title);

        d.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = d.findElement(By.xpath("//*[@id='APjFqb']"));
        WebElement submitButton = d.findElement(By.xpath("//*[@value='Google Search']") );

        textBox.sendKeys("Selenium");
textBox.click();
        submitButton.click();
        List<WebElement> message = d.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
        d.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        for (WebElement i :message) {
            assertTrue(i.getText().contains("Selenium"));
        }
        d.quit();
    }

}
