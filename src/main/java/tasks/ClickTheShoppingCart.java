package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.ProductDetails.BTN_ADD_SHOPPING;


public class ClickTheShoppingCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ADD_SHOPPING));
    }



    public static ClickTheShoppingCart button() {
        return Tasks.instrumented(ClickTheShoppingCart.class);
    }
}