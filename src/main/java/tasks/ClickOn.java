package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.Home.TXT_SELECTED_PRODUCT;
import static userinterfaces.ProductDetails.TXT_SELECTED_PRODUCT_NAME;


public class ClickOn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TXT_SELECTED_PRODUCT,isVisible()).
                forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(TXT_SELECTED_PRODUCT));
    }



    public static ClickOn theProduct() {

        return Tasks.instrumented(ClickOn.class);
    }
}
