package po;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FiltroPO extends MasterWebPO {

    /*
    @FindBy(linkText = "R$1000 a R$2000")
    WebElement filter;
     */

    @FindBy(id = "low-price")
    WebElement precoMin;

    @FindBy(id = "high-price")
    WebElement precoMax;

    @FindBy(partialLinkText = "Poco")
    WebElement poco;

    public FiltroPO(WebDriver driver){
        super(driver);
    }

    public CarrinhoPO adicionarFiltro(String min, String max){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,400)");
        wait.until(ExpectedConditions.elementToBeClickable(precoMin)).click();
        precoMin.sendKeys(min);
        wait.until(ExpectedConditions.elementToBeClickable(precoMax)).click();
        precoMax.sendKeys(max);
        js.executeScript("window.scrollBy(400,0)");
        wait.until(ExpectedConditions.elementToBeClickable(poco)).click();

        return new CarrinhoPO(driver);

    }

}
