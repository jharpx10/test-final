package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static userinterfaces.ProductDetails.TXT_SELECTED_PRODUCT_NAME;

public class ValidateTheProduct implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        String productName=TXT_SELECTED_PRODUCT_NAME.resolveFor(actor).getText();
        return  productName;
    }

    public static ValidateTheProduct name() {
        return new ValidateTheProduct();
    }
}
