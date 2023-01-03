package co.com.choucair.certification.serenity_automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal extends PageObject {

    public static final Target ENTER_ORGANIZATION = Target.the("Clic en la seccion de organizacion")
            .located(By.xpath("//span[text()='Organization']"));
    public static final Target ENTER_BUSINESS_UNITS = Target.the("Clic en la seccion de organizacion")
            .located(By.xpath("//span[text()='Business Units']"));
    public static final Target ENTER_NEW_BUSINESS = Target.the("Clic en la seccion de organizacion")
            .located(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/div/div[1]"));

    public static final Target BUSINESS_UNIT_SUCCESS= Target.the("where we can confirm the business unit register")
            .located(By.xpath("//*[@id=\"toast-container\"]/div/div"));
}
