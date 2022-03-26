package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

    public static final Target TXT_SELECTED_PRODUCT = Target.the("Selected product link")
            .located(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/h5/a"));



}
