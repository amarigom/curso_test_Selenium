package proyecto_selenium.pages;

public class PaginaPrincipal extends BasePage {


public PaginaPrincipal() {
        super(driver);
    }

public void navigateToFreeRangeTesters() {
    navigateTo("https://www.abc.gob.ar");
}

}
