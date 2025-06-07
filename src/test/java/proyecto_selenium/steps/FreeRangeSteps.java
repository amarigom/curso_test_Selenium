package proyecto_selenium.steps;

import io.cucumber.java.en.*;

import proyecto_selenium.pages.PaginaPrincipal;
public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
 
    @Given("I navigate to abc.gob.ar")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When ("I go to a section using the navigation bar")
    public void navigationBarUse(){
        landingPage.clickOnSectionNavigationBar();

    }    

}
