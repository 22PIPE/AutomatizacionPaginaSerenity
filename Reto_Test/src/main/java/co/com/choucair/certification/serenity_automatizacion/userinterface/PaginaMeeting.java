package co.com.choucair.certification.serenity_automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaMeeting extends PageObject {

    public static final Target ENTER_MEETING = Target.the("Clic en la seccion de reuniones")
            .located(By.xpath("//*[@id=\"nav_menu1_3\"]/li[2]/a"));
    public static final Target ENTER_MEETING2 = Target.the("Clic en la sub-seccion de reuniones")
            .located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[2]/ul/li[1]/a"));

    public static final Target ENTER_NUEVA_REUNION = Target.the("Clic en el boton nueva reunion")
            .located(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/div/div[1]"));
}
