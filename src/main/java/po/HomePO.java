package po;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePO extends MasterWebPO {

    @FindBy(id = "nav-global-location-popover-link")
    WebElement btnAdicionarCep;

    @FindBy(id = "GLUXZipUpdateInput_0")
    WebElement fieldCep;

    @FindBy(id = "GLUXZipUpdateInput_1")
    WebElement fieldCepp;

    @FindBy(css = "input[aria-labelledby=GLUXZipUpdate-announce]")
    WebElement btnConfirmarCep;


    public HomePO(WebDriver driver) {
        super(driver);
    }

    public PesquisaPO addCep(String url, String cep) throws InterruptedException {
        setUpUrl(url);
        wait.until(ExpectedConditions.elementToBeClickable(btnAdicionarCep)).click();
        wait.until(ExpectedConditions.elementToBeClickable(fieldCep)).click();
        fieldCep.sendKeys(cep.substring(0,5));
        fieldCepp.click();
        fieldCepp.sendKeys(cep.substring(5,8));
        wait.until(ExpectedConditions.elementToBeClickable(btnConfirmarCep)).click();
        Thread.sleep(1000);
        return new PesquisaPO(driver);
    }
}