package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarrinhoPO extends MasterWebPO{

    @FindBy(id = "add-to-cart-button")
    WebElement btnAdicionarCarrinho;

    @FindBy(css = "input[aria-labelledby=attachSiNoCoverage-announce]")
    WebElement btnNaoObrigado;

    @FindBy(className = "nav-logo-link")
    WebElement logoInicio;

    public CarrinhoPO(WebDriver driver){
        super(driver);
    }

    public CarrinhoPO adicionarCarrinho() throws InterruptedException{

        wait.until(ExpectedConditions.elementToBeClickable(btnAdicionarCarrinho)).click();
        wait.until(ExpectedConditions.elementToBeClickable(btnNaoObrigado)).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(logoInicio)).click();

        return this;
    }
}
