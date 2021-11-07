package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverHelper{

    public WebDriver setUpDriver(String browser, WebDriver driver){

        System.setProperty("webdriver.chrome.drivew","c:/autodrivers/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","c:/autodrivers/geckodriver.exe");

        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }else {
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
