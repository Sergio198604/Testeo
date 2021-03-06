package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Test extends TestBase{

    @Given("^El usuario se encuentra en la página Home de iamalittletester$")
    public void el_usuario_se_encuentra_en_la_página_Home_de_iamalittletester() throws Throwable {
      Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el botón  The little tester comics$")
    public void hace_click_sobre_el_botón_The_little_tester_comics() throws Throwable {
       homePage.clickOnTitleComics();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
        Assert.assertTrue("No se redirecciono correctamente a la página de Comics", comicsPage.isTitleComicsDisplayed());
    }
}
