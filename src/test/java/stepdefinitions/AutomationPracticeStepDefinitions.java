package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.IncorrectPricesException;
import exceptions.IncorrectProductNameException;
import exceptions.IncorrectSuccessfulMessageException;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ValidateTheCheckoutProduct;
import questions.ValidateTheProduct;
import questions.ValidateTheSuccessful;
import tasks.ClickOn;
import tasks.ClickTheProceedToCheckout;
import tasks.ClickTheShoppingCart;

public class AutomationPracticeStepDefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void initialize() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("user");
    }

    @Given("^user is on automation practice web$")
    public void userIsOnAutomationPracticeWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://automationpractice.com/index.php"));
    }

    @When("^user clicks on product$")
    public void userClicksOnProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickOn.theProduct());
    }

    @Then("^user will see selected product name on details page$")
    public void userWillSeeSelectedProductNameOnDetailsPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTheProduct.name(),
                Matchers.equalTo("Faded Short Sleeve T-shirts")).orComplainWith(IncorrectProductNameException.class,
                "The product name is incorrect "));
    }
    @When("^user clicks on add button$")
    public void userClicksOnAddButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickTheShoppingCart.button());
    }

    @When("^user clicks on proceed to checkout button$")
    public void userClicksOnProceedToCheckoutButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickTheProceedToCheckout.button());
    }


    @Then("^user will see successfull message$")
    public void userWillSeeSuccessfullMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTheSuccessful.message(),
                Matchers.equalTo("Product successfully added to your shopping cart")).orComplainWith(IncorrectSuccessfulMessageException.class,
                "There is not successful message"));
    }

    @Then("^user will see the same product price of product details page$")
    public void userWillSeeTheSameProductPriceOfProductDetailsPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTheCheckoutProduct.price(),
                Matchers.equalTo("$16.51")).orComplainWith(IncorrectPricesException.class,
                "The product price is not the same in product details and checkout page"));
    }

}
