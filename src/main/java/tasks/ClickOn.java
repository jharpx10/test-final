package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.Home.TXT_SELECTED_PRODUCT;


public class ClickOn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TXT_SELECTED_PRODUCT));
    }



    public static ClickOn theProduct() {

        return Tasks.instrumented(ClickOn.class);
    }
}
