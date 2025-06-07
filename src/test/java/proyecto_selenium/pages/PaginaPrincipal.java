package proyecto_selenium.pages;

public class PaginaPrincipal extends BasePage {

private String   sectionLink = "//a[@title='Jubilaciones']";


public PaginaPrincipal() {
        super(driver);
    }

public void navigateToFreeRangeTesters() {
    navigateTo("https://www.abc.gob.ar");
}

public void clickOnSectionNavigationBar(){
    
    clickElement(sectionLink);

}

}
