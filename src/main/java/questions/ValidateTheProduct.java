package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.Checkout.TXT_PRODUCT_PRICE;
import static userinterfaces.ProductDetails.TXT_SELECTED_PRODUCT_NAME;

public class ValidateTheProduct implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(TXT_SELECTED_PRODUCT_NAME,isVisible()).
                forNoMoreThan(10).seconds());
        String productName=TXT_SELECTED_PRODUCT_NAME.resolveFor(actor).getText();
        return  productName;
    }

    public static ValidateTheProduct name() {
        return new ValidateTheProduct();
    }
}
