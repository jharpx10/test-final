package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Checkout {

    public static final Target TXT_PRODUCT_PRICE = Target.the("Checkout product price label")
            .located(By.xpath("//*[@id=\"total_product\"]"));

}
