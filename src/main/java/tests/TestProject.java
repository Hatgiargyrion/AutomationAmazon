package tests;


import driver.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import po.CarrinhoPO;
import po.HomePO;

public class TestProject {

    private WebDriver driver;
    private WebDriverWait wait  ;
    private Assertion assertion;

    @BeforeMethod
    public void setUp(@Optional("")String browser){

    this.driver = new DriverHelper().setUpDriver(browser, driver);
    this.wait = new WebDriverWait(driver, 10);

    }

    @Test
    @Parameters({"url", "pesquisa", "cep", "min", "max"})
    public void testeMaga(@Optional ("https://www.amazon.com.br/") String url,
                          @Optional ("Poco X3") String produto,
                          @Optional ("02882100") String cep,
                          @Optional ("1000") String min,
                          @Optional ("2000") String max) throws InterruptedException {
        CarrinhoPO HomePO = new HomePO(driver)
                .addCep(url, cep)
                .pesquisa(produto)
                .adicionarFiltro(min, max)
                .adicionarCarrinho();
    }
}
