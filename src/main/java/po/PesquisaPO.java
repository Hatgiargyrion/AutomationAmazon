package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PesquisaPO extends MasterWebPO{

    @FindBy(id = "nav-search-submit-button")
    WebElement btnPesquisar;

    @FindBy(id = "twotabsearchtextbox")
    WebElement fieldPesquisa;

    @FindBy(partialLinkText = "Poco")
    WebElement poco;



    public PesquisaPO(WebDriver driver) {
        super(driver);
    }

    public FiltroPO pesquisa(String produto) {

        wait.until(ExpectedConditions.elementToBeClickable(fieldPesquisa)).click();
        fieldPesquisa.sendKeys(produto);
        wait.until(ExpectedConditions.elementToBeClickable(btnPesquisar)).click();
        wait.until(ExpectedConditions.elementToBeClickable(poco)).click();
        driver.navigate().back();

        return new FiltroPO(driver);
    }
}
