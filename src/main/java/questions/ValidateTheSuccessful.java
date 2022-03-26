package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.ProductDetails.TXT_SUCCESSFUL_MESSAGE;


public class ValidateTheSuccessful implements Question {


    @Override
    public Object answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(TXT_SUCCESSFUL_MESSAGE,isVisible()).
                forNoMoreThan(10).seconds());
        String messageDetails=TXT_SUCCESSFUL_MESSAGE.resolveFor(actor).getText();

        return  messageDetails;
    }

    public static ValidateTheSuccessful message() {
        return new ValidateTheSuccessful();
    }
}
