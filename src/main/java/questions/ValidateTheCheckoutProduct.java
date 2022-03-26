package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.Checkout.TXT_PRODUCT_PRICE;


public class ValidateTheCheckoutProduct  implements Question {


    @Override
    public Object answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(TXT_PRODUCT_PRICE,isVisible()).
                forNoMoreThan(10).seconds());
        String messageDetails=TXT_PRODUCT_PRICE.resolveFor(actor).getText();

        return  messageDetails;
    }

    public static ValidateTheCheckoutProduct price() {
        return new ValidateTheCheckoutProduct();
    }
}
