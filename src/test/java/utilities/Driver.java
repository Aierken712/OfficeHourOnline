package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

    public static WebDriver getDriver(String browser){
        browser = browser.toLowerCase();
        switch(browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                // ChromeOptions chromeOptions = new ChromeOptions().setHeadless(true);
                return new ChromeDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "chromeHeadless":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions().setHeadless(true);
                return new ChromeDriver(chromeOptions);
            case "firefoxHeadless":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions().setHeadless(true);
                return new FirefoxDriver(firefoxOptions);
        }

        return null;
    }

}
