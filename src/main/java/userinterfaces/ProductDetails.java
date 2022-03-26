package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductDetails {


    public static final Target TXT_SELECTED_PRODUCT_NAME = Target.the("Selected product name")
            .located(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
    public static final Target TXT_SUCCESSFUL_MESSAGE = Target.the("Successful message")
            .located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));

    public static final Target BTN_ADD_SHOPPING = Target.the("Add shopping cart button ")
            .located(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
    public static final Target BTN_PROCEED_TO_CHECKOUT = Target.the("Proceed to checkout button ")
            .located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));


}
