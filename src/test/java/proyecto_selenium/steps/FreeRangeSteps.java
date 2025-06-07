package proyecto_selenium.steps;

import io.cucumber.java.en.Given;
import proyecto_selenium.pages.PaginaPrincipal;

public class FreeRangeSteps {
    PaginaPrincipal landingPage = new PaginaPrincipal();
 
    
    @Given("I navigate to abc.gob.ar")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    

}
