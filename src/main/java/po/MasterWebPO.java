package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class MasterWebPO {

    public WebDriver driver;
    public WebDriverWait wait;

    public MasterWebPO (WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 15);
    }

    public void setUpUrl(String url){
        driver.get(url);
    }
}