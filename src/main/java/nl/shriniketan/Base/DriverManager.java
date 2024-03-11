package nl.shriniketan.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {


 public static WebDriver InitChromeDriver(){
     WebDriver driver = new ChromeDriver();
     return driver;
 }
    public static WebDriver InitFireFoxDriver(){
        WebDriver driver = new FirefoxDriver();
        return driver;
    }


}
