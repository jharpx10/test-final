package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.ProductDetails.BTN_PROCEED_TO_CHECKOUT;


public class ClickTheProceedToCheckout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(BTN_PROCEED_TO_CHECKOUT,isVisible()).
                forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(BTN_PROCEED_TO_CHECKOUT));
    }

    public static ClickTheProceedToCheckout button() {
        return Tasks.instrumented(ClickTheProceedToCheckout.class);
    }
}